package net.internalerror.futuristicfactories.block.entity.machine.pulverizing;

import java.util.Optional;
import net.internalerror.futuristicfactories.block.entity.machine.util.FFSimpleMachineBlockEntity;
import net.internalerror.futuristicfactories.data.recipe.PulverizingRecipe;
import net.internalerror.futuristicfactories.data.recipe.type.PulverizingRecipeType;
import net.internalerror.futuristicfactories.gui.menu.PulverizingMachineMenu;
import net.internalerror.futuristicfactories.registry.FFBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PulverizingMachineBlockEntity extends FFSimpleMachineBlockEntity<PulverizingRecipe> {
  
  public static final int Slot_Index_Speed_Upgrade = 0;
  public static final int Slot_Index_Energy_Upgrade = 1;
  public static final int Slot_Index_Wip_Upgrade = 2;
  public static final int Slot_Index_Ingredient = 3;
  public static final int Slot_Index_Result = 4;
  public static final int Slot_Index_Secondary_Result = 5;
  
  public PulverizingMachineBlockEntity(BlockPos pPos, BlockState pBlockState) {
    super(FFBlockEntityTypes.pulverizing_machine.get(), pPos, pBlockState);
  }
  
  @Override
  protected int getSlotCount() {
    return 6;
  }
  
  @Override
  public String getName() {
    return "pulverizing_machine";
  }
  
  @Nullable
  @Override
  public AbstractContainerMenu createMenu(int containerId, @NotNull Inventory playerInventory, @NotNull Player player) {
    return new PulverizingMachineMenu(containerId, playerInventory, this, this.data);
  }
  
  public static void tick(Level level, BlockPos blockPos, BlockState blockState, PulverizingMachineBlockEntity blockEntity) {
    if (level.isClientSide) return;
    
    if (hasRecipe(blockEntity)) {
      blockEntity.progress++;
      setChanged(level, blockPos, blockState);
      if (blockEntity.progress >= blockEntity.maxProgress) {
        craftItem(blockEntity);
      }
    } else {
      blockEntity.resetProgress();
      setChanged(level, blockPos, blockState);
    }
    
    
  }
  
  
  private static void craftItem(PulverizingMachineBlockEntity blockEntity) {
    Level level = blockEntity.level;
    
    
    SimpleContainer inventory = new SimpleContainer(blockEntity.itemStackHandler.getSlots());
    for (int i = 0; i < blockEntity.itemStackHandler.getSlots(); i++) {
      inventory.setItem(i, blockEntity.itemStackHandler.getStackInSlot(i));
    }
    
    Optional<PulverizingRecipe> recipe = level.getRecipeManager().getRecipeFor(PulverizingRecipeType.instance, inventory, level);
    
    
    if (hasRecipe(blockEntity)) {
      blockEntity.itemStackHandler.extractItem(Slot_Index_Ingredient, 1, false);
      blockEntity.itemStackHandler.setStackInSlot(Slot_Index_Result, new ItemStack(recipe.get().getResultItem().getItem(), blockEntity.itemStackHandler.getStackInSlot(Slot_Index_Result).getCount() + recipe.get().getResultCount()));
      
      if (recipe.get().getSecondaryResult() != null && Math.random() <= recipe.get().getSecondaryResultChance()) {
        blockEntity.itemStackHandler.setStackInSlot(Slot_Index_Secondary_Result, new ItemStack(recipe.get().getSecondaryResult(), blockEntity.itemStackHandler.getStackInSlot(Slot_Index_Secondary_Result).getCount() + 1));
      }
      blockEntity.resetProgress();
      
      
    }
  }
  
  private static boolean hasRecipe(PulverizingMachineBlockEntity blockEntity) {
    Level level = blockEntity.level;
    
    
    SimpleContainer inventory = new SimpleContainer(blockEntity.itemStackHandler.getSlots());
    for (int i = 0; i < blockEntity.itemStackHandler.getSlots(); i++) {
      inventory.setItem(i, blockEntity.itemStackHandler.getStackInSlot(i));
    }
    
    Optional<PulverizingRecipe> recipe = level.getRecipeManager().getRecipeFor(PulverizingRecipeType.instance, inventory, level);
    
    
    return recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory, recipe.get().getResultCount(), recipe.get()) && canInsertItemIntoOutputslot(inventory, recipe.get().getResultItem(), recipe.get());
  }
  
  private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory, int count, PulverizingRecipe pRecipe) {
    
    if (pRecipe.getSecondaryResult() != null) {
      if (inventory.getItem(Slot_Index_Secondary_Result).getMaxStackSize() < inventory.getItem(Slot_Index_Secondary_Result).getCount() + 1) {
        return false;
      }
    }
    
    
    return inventory.getItem(Slot_Index_Result).getMaxStackSize() >= inventory.getItem(Slot_Index_Result).getCount() + count;
  }
  
  private static boolean canInsertItemIntoOutputslot(SimpleContainer inventory, ItemStack itemStack, PulverizingRecipe pRecipe) {
    if (pRecipe.getSecondaryResult() != null) {
      if (inventory.getItem(Slot_Index_Secondary_Result).getItem() != pRecipe.getSecondaryResult() && !inventory.getItem(Slot_Index_Secondary_Result).isEmpty()) {
        return false;
      }
    }
    
    
    return inventory.getItem(Slot_Index_Result).getItem() == itemStack.getItem() || inventory.getItem(Slot_Index_Result).isEmpty();
  }
}
