package net.internalerror.futuristicfactories.registry;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class FFRegistryBlock extends FFRegistryObject<Block> {

    public FFRegistryBlock(String name, Supplier<Block> supplier) {
        super(name, supplier);
    }

    @Override
    protected RegistryObject<Block> register() {
        return FFBlock.register(this);
    }

}
