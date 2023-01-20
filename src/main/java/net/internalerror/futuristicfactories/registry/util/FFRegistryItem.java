package net.internalerror.futuristicfactories.registry.util;

import net.internalerror.futuristicfactories.registry.FFItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FFRegistryItem extends FFRegistryObject<Item> {

    public FFRegistryItem(String name, Supplier<Item> supplier) {
        super(name, supplier);
    }

    @Override
    protected RegistryObject<Item> register() {
        return FFItem.register(this);
    }
}