package net.internalerror.futuristicfactories.block.entity.machine.util;

import net.internalerror.futuristicfactories.data.recipe.util.FFSimpleRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class FFSimpleMachineBlockEntity<R extends FFSimpleRecipe> extends BlockEntity implements MenuProvider {
  
  
  public static final int Data_Index_Progress = 0;
  public static final int Data_Index_Max_Progress = 1;
  protected int progress = 0;
  protected int maxProgress = 78;
  protected final ContainerData data;
  
  protected abstract int getSlotCount();
  
  protected final ItemStackHandler itemStackHandler = new ItemStackHandler(getSlotCount()) {
    @Override
    protected void onContentsChanged(int slot) {
      setChanged();
    }
  };
  
  private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
  
  
  public FFSimpleMachineBlockEntity(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState) {
    super(pType, pPos, pBlockState);
    
    data = new ContainerData() {
      @Override
      public int get(int index) {
        return switch (index) {
          case Data_Index_Progress -> progress;
          case Data_Index_Max_Progress -> maxProgress;
          default -> Data_Index_Progress;
        };
      }
      
      @Override
      public void set(int index, int value) {
        switch (index) {
          case Data_Index_Progress -> progress = value;
          case Data_Index_Max_Progress -> maxProgress = value;
        }
      }
      
      @Override
      public int getCount() {
        return 2;
      }
    };
    
  }
  
  @Override
  public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
    if (cap == ForgeCapabilities.ITEM_HANDLER) {
      return lazyItemHandler.cast();
    }
    return super.getCapability(cap, side);
  }
  
  @Override
  public void invalidateCaps() {
    super.invalidateCaps();
    lazyItemHandler.invalidate();
  }
  
  @Override
  public void onLoad() {
    super.onLoad();
    lazyItemHandler = LazyOptional.of(() -> itemStackHandler);
  }
  
  
  public abstract String getName();
  
  @Override
  public Component getDisplayName() {
    return Component.literal(getName());
  }
  
  @Override
  protected void saveAdditional(CompoundTag compoundTag) {
    compoundTag.put("inventory", itemStackHandler.serializeNBT());
    compoundTag.putInt(getName() + ".progress", progress);
    super.saveAdditional(compoundTag);
  }
  
  @Override
  public void load(@NotNull CompoundTag compoundTag) {
    super.load(compoundTag);
    itemStackHandler.deserializeNBT(compoundTag.getCompound("inventory"));
    progress = compoundTag.getInt(getName() + ".progress");
  }
  
  public void drops() {
    SimpleContainer inventory = new SimpleContainer(itemStackHandler.getSlots());
    for (int i = 0; i < itemStackHandler.getSlots(); i++) {
      inventory.setItem(i, itemStackHandler.getStackInSlot(i));
    }
    Containers.dropContents(level, worldPosition, inventory);
  }
  
  protected void resetProgress() {
    this.progress = 0;
  }
  
}
