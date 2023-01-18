package net.internalerror.futuristicfactories.registry;

import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public abstract class FFRegistryObject<T extends ItemLike> {


    private final RegistryObject<T> registryObject_;
    private final String name_;
    private final Supplier<T> supplier_;

    public FFRegistryObject(String name, Supplier<T> supplier) {
        this.name_ = name;
        this.supplier_ = supplier;
        this.registryObject_ = this.register();
    }

    protected abstract RegistryObject<T> register();

    public RegistryObject<T> getRegistryObject() {
        return registryObject_;
    }

    public Supplier<T> getSupplier() {
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
