package net.internalerror.futuristicfactories.registry.util;

import net.internalerror.futuristicfactories.registry.FFBlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FFRegistryBlockEntity {

    private final RegistryObject<BlockEntityType<?>> registryObject_;
    private final String name_;
    private final Supplier<BlockEntityType<?>> supplier_;

    public FFRegistryBlockEntity(String name, Supplier<BlockEntityType<?>> supplier) {
        this.name_ = name;
        this.supplier_ = supplier;
        this.registryObject_ = this.register();
    }

    protected RegistryObject<BlockEntityType<?>> register() {
        return FFBlockEntityType.register(this);
    }

    public RegistryObject<BlockEntityType<?>> getRegistryObject() {
        return registryObject_;
    }

    public Supplier<BlockEntityType<?>> getSupplier() {
        return supplier_;
    }

    public String getName() {
        return name_;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name_, registryObject_.getKey());
    }

    public BlockEntityType<?> get() {
        return registryObject_.get();
    }
}
