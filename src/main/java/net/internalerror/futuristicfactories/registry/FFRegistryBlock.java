package net.internalerror.futuristicfactories.registry;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FFRegistryBlock {

    private final RegistryObject<Block> registryObject_;
    private final String name_;
    private final Supplier<Block> supplier_;

    public FFRegistryBlock(String name, Supplier<Block> supplier) {
        this.name_ = name;
        this.supplier_ = supplier;
        this.registryObject_ = FFBlock.register(this);
    }

    public Supplier<Block> getSupplier() {
        return supplier_;
    }

    public RegistryObject<Block> getRegistryObject() {
        return registryObject_;
    }

    public String getName() {
        return name_;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name_, registryObject_.getKey());
    }
}
