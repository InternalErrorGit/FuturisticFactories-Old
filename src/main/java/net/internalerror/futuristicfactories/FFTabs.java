package net.internalerror.futuristicfactories;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.item.Items.COMMAND_BLOCK;

public class FFTabs extends CreativeModeTab {

    public static final FFTabs MATERIALS = new FFTabs(CreativeModeTab.TABS.length, "FF Materials");

    public FFTabs(int index, String name) {
        super(index, name);
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(COMMAND_BLOCK.asItem());
    }
}
