package net.internalerror.futuristicfactories.block.machine.crushing;

import net.internalerror.futuristicfactories.data.recipe.CrushingRecipe;
import net.internalerror.futuristicfactories.data.recipe.type.CrushingRecipeType;
import net.internalerror.futuristicfactories.registry.FFBlockEntityType;
import net.internalerror.futuristicfactories.screen.CrushingMachineMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CrushingMachineBlockEntity extends BlockEntity implements MenuProvider {

    public static final int Slot_Index_Speed_Upgrade = 0;
    public static final int Slot_Index_Energy_Upgrade = 1;
    public static final int Slot_Index_Wip_Upgrade = 2;
    public static final int Slot_Index_Ingredient = 3;
    public static final int Slot_Index_Result = 4;
    public static final int Slot_Index_Secondary_Result = 5;


    public static final int Data_Index_Progress = 0;
    public static final int Data_Index_Max_Progress = 1;
    private int progress = 0;
    private int maxProgress = 78;
    protected final ContainerData data;

    private final ItemStackHandler itemStackHandler = new ItemStackHandler(6) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();


    public CrushingMachineBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(FFBlockEntityType.crushing_machine.get(), blockPos, blockState);
        data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case Data_Index_Progress -> CrushingMachineBlockEntity.this.progress;
                    case Data_Index_Max_Progress -> CrushingMachineBlockEntity.this.maxProgress;
                    default -> Data_Index_Progress;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case Data_Index_Progress -> CrushingMachineBlockEntity.this.progress = value;
                    case Data_Index_Max_Progress -> CrushingMachineBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Crushing Machine");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new CrushingMachineMenu(id, inventory, this, this.data);
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

    @Override
    protected void saveAdditional(CompoundTag compoundTag) {
        compoundTag.put("inventory", itemStackHandler.serializeNBT());
        compoundTag.putInt("crushing_machine.progress", progress);
        super.saveAdditional(compoundTag);
    }

    @Override
    public void load(CompoundTag compoundTag) {
        super.load(compoundTag);
        itemStackHandler.deserializeNBT(compoundTag.getCompound("inventory"));
        progress = compoundTag.getInt("crushing_machine.progress");
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemStackHandler.getSlots());
        for (int i = 0; i < itemStackHandler.getSlots(); i++) {
            inventory.setItem(i, itemStackHandler.getStackInSlot(i));
        }
        Containers.dropContents(level, worldPosition, inventory);
    }

    public static void tick(Level level, BlockPos blockPos, BlockState blockState, CrushingMachineBlockEntity blockEntity) {
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

    private void resetProgress() {
        this.progress = 0;
    }

    private static void craftItem(CrushingMachineBlockEntity blockEntity) {
        Level level = blockEntity.level;


        SimpleContainer inventory = new SimpleContainer(blockEntity.itemStackHandler.getSlots());
        for (int i = 0; i < blockEntity.itemStackHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemStackHandler.getStackInSlot(i));
        }

        Optional<CrushingRecipe> recipe = level.getRecipeManager().getRecipeFor(CrushingRecipeType.instance, inventory, level);


        if (hasRecipe(blockEntity)) {
            blockEntity.itemStackHandler.extractItem(Slot_Index_Ingredient, 1, false);
            blockEntity.itemStackHandler.setStackInSlot(Slot_Index_Result, new ItemStack(recipe.get().getResultItem().getItem(), blockEntity.itemStackHandler.getStackInSlot(Slot_Index_Result).getCount() + recipe.get().getResultCount()));

            if (recipe.get().getSecondaryResult() != null && Math.random() <= recipe.get().getSecondaryResultChance()) {
                blockEntity.itemStackHandler.setStackInSlot(Slot_Index_Secondary_Result, new ItemStack(recipe.get().getSecondaryResult().getItem(), blockEntity.itemStackHandler.getStackInSlot(Slot_Index_Secondary_Result).getCount() + 1));
            }
            blockEntity.resetProgress();


        }
    }

    private static boolean hasRecipe(CrushingMachineBlockEntity blockEntity) {
        Level level = blockEntity.level;


        SimpleContainer inventory = new SimpleContainer(blockEntity.itemStackHandler.getSlots());
        for (int i = 0; i < blockEntity.itemStackHandler.getSlots(); i++) {
            inventory.setItem(i, blockEntity.itemStackHandler.getStackInSlot(i));
        }

        Optional<CrushingRecipe> recipe = level.getRecipeManager().getRecipeFor(CrushingRecipeType.instance, inventory, level);


        return recipe.isPresent() && canInsertAmountIntoOutputSlot(inventory, recipe.get().getResultCount(), recipe.get()) && canInsertItemIntoOutputslot(inventory, recipe.get().getResultItem(), recipe.get());
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleContainer inventory, int count, CrushingRecipe pRecipe) {

        if (pRecipe.getSecondaryResult() != null) {
            if (inventory.getItem(Slot_Index_Secondary_Result).getMaxStackSize() < inventory.getItem(Slot_Index_Secondary_Result).getCount() + 1) {
                return false;
            }
        }


        return inventory.getItem(Slot_Index_Result).getMaxStackSize() >= inventory.getItem(Slot_Index_Result).getCount() + count;
    }

    private static boolean canInsertItemIntoOutputslot(SimpleContainer inventory, ItemStack itemStack, CrushingRecipe pRecipe) {
        if (pRecipe.getSecondaryResult() != null) {
            if (inventory.getItem(Slot_Index_Secondary_Result).getItem() != pRecipe.getSecondaryResult().getItem() && !inventory.getItem(Slot_Index_Secondary_Result).isEmpty()) {
                return false;
            }
        }


        return inventory.getItem(Slot_Index_Result).getItem() == itemStack.getItem() || inventory.getItem(Slot_Index_Result).isEmpty();
    }
}
