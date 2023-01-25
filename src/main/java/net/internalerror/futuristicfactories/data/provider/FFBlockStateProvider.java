package net.internalerror.futuristicfactories.data.provider;

import net.internalerror.futuristicfactories.registry.FFBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;
import static net.internalerror.futuristicfactories.FuturisticFactories.getId;

public class FFBlockStateProvider extends BlockStateProvider {
    public FFBlockStateProvider(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        FFBlocks.Util.getSimpleBlocks().forEach(block -> {
            simpleBlock(block.get());
        });


        horizontalBlock(FFBlocks.crushing_machine.get(), getId("block/crushing_machine_side"), getId("block/crushing_machine_front"), getId("block/crushing_machine_top"));


    }
}
