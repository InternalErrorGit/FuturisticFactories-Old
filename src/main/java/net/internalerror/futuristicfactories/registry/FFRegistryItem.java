package net.internalerror.futuristicfactories.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FFRegistryItem {

    private final RegistryObject<Item> registryObject_;
    private final String name_;
    private final Supplier<Item> supplier_;

    public FFRegistryItem(String name, Supplier<Item> supplier) {
        this.name_ = name;
        this.supplier_ = supplier;
        this.registryObject_ = FFItem.register(this);
    }

    public RegistryObject<Item> getRegistryObject() {
        return registryObject_;
    }

    public Supplier<Item> getSupplier() {
        return supplier_;
    }

    public String getName() {
        return name_;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name_, registryObject_.getKey());
    }
}