package net.internalerror.futuristicfactories.registry.util;

import net.internalerror.futuristicfactories.registry.FFBlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FFRegistryBlockItem extends FFRegistryObject<Item> {

    public FFRegistryBlockItem(String name, Supplier<Item> supplier) {
        super(name, supplier);
    }

    @Override
    protected RegistryObject<Item> register() {
        return FFBlockItem.register(this);
    }
}