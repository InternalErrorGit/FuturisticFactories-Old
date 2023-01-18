package net.internalerror.futuristicfactories.data.generator;

import net.internalerror.futuristicfactories.registry.FFBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlockStateProvider extends BlockStateProvider {
    public FFBlockStateProvider(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        FFBlock.Util.getSimpleBlocks().forEach(block -> simpleBlock(block.getRegistryObject().get()));
    }
}
