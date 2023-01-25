package net.internalerror.futuristicfactories.gui.menu;

import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.block.entity.machine.crushing.CrushingMachineBlockEntity;
import net.internalerror.futuristicfactories.registry.FFBlocks;
import net.internalerror.futuristicfactories.registry.FFMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;


public class CrushingMachineMenu extends AbstractContainerMenu {

    public final CrushingMachineBlockEntity blockEntity;
    private final Level level;
    private final ContainerData data;

    public CrushingMachineMenu(int id, Inventory inventory, FriendlyByteBuf extraData) {
        this(id, inventory, inventory.player.level.getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public CrushingMachineMenu(int id, Inventory inventory, BlockEntity blockEntity, ContainerData data) {
        super(FFMenuTypes.crushing_machine_menu.get(), id);
        checkContainerSize(inventory, 6);
        this.blockEntity = (CrushingMachineBlockEntity) blockEntity;
        this.level = inventory.player.level;
        this.data = data;

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);

        this.blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
            addSlot(new SlotItemHandler(handler, CrushingMachineBlockEntity.Slot_Index_Speed_Upgrade, 12, 16));
            addSlot(new SlotItemHandler(handler, CrushingMachineBlockEntity.Slot_Index_Energy_Upgrade, 12, 36));
            addSlot(new SlotItemHandler(handler, CrushingMachineBlockEntity.Slot_Index_Wip_Upgrade, 12, 56));

            addSlot(new SlotItemHandler(handler, CrushingMachineBlockEntity.Slot_Index_Ingredient, 42, 36));
            addSlot(new SlotItemHandler(handler, CrushingMachineBlockEntity.Slot_Index_Result, 118, 26));
            addSlot(new SlotItemHandler(handler, CrushingMachineBlockEntity.Slot_Index_Secondary_Result, 109, 46));
        });


        addDataSlots(this.data);
    }

    public boolean isCrafting() {
        return data.get(CrushingMachineBlockEntity.Data_Index_Progress) > 0;
    }

    public int getScaledProgress() {
        int progress = data.get(CrushingMachineBlockEntity.Data_Index_Progress);
        int maxProgress = data.get(CrushingMachineBlockEntity.Data_Index_Max_Progress);
        int progressArrowSize = 22;

        return maxProgress != 0 && progress != 0 ? progress * progressArrowSize / maxProgress : 0;
    }


    private static final int hotbar_slot_count = 9;
    private static final int player_inventor_row_count = 3;
    private static final int player_inventory_column_count = 9;
    private static final int player_inventory_slot_count = player_inventory_column_count * player_inventor_row_count;
    private static final int vanilla_slot_count = hotbar_slot_count + player_inventory_slot_count;
    private static final int vanilla_first_slot_index = 0;
    private static final int te_inventory_first_slot_index = vanilla_first_slot_index + vanilla_slot_count;
    private static final int te_inventory_slot_count = 3;

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        if (index < vanilla_first_slot_index + vanilla_slot_count) {
            if (!moveItemStackTo(sourceStack, te_inventory_first_slot_index, te_inventory_first_slot_index + te_inventory_slot_count, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index < te_inventory_first_slot_index + te_inventory_slot_count) {
            if (!moveItemStackTo(sourceStack, vanilla_first_slot_index, vanilla_first_slot_index + vanilla_slot_count, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            FuturisticFactories.LOGGER.error("Invalid slot index: {}", index);
            return ItemStack.EMPTY;
        }

        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(player, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()), player, FFBlocks.crushing_machine.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 9; l++) {
                addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 108 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; i++) {
            addSlot(new Slot(playerInventory, i, 8 + i * 18, 166));
        }
    }


}
