package net.internalerror.futuristicfactories;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.item.Items.COMMAND_BLOCK;

public class FFTabs extends CreativeModeTab {

    public static final FFTabs MATERIALS = new FFTabs(CreativeModeTab.TABS.length, "ff_materials");
    public static final FFTabs COMPONENTS = new FFTabs(CreativeModeTab.TABS.length, "ff_components");
    public static final FFTabs MACHINES = new FFTabs(CreativeModeTab.TABS.length, "ff_machines");
    public static final FFTabs TOOLS = new FFTabs(CreativeModeTab.TABS.length, "ff_tools");

    public FFTabs(int index, String name) {
        super(index, name);
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(COMMAND_BLOCK.asItem());
    }
}
