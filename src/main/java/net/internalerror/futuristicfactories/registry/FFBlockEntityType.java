package net.internalerror.futuristicfactories.registry;

import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.block.machine.crushing.CrushingMachineBlockEntity;
import net.internalerror.futuristicfactories.registry.util.FFRegistryBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlockEntityType {
    private static final DeferredRegister<BlockEntityType<?>> register = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MOD_ID);

    public static final RegistryObject<BlockEntityType<CrushingMachineBlockEntity>> crushing_machine = register.register("crushing_machine", () -> BlockEntityType.Builder.of(CrushingMachineBlockEntity::new, FFBlock.crushing_machine.get()).build(null));


    public static RegistryObject<BlockEntityType<?>> register(FFRegistryBlockEntity registryBlockEntity) {
        FuturisticFactories.LOGGER.debug("Registering >> {}", registryBlockEntity.getName());
        return register.register(registryBlockEntity.getName(), registryBlockEntity.getSupplier());
    }

    public static void register(IEventBus modEventBus) {
        register.register(modEventBus);
    }
}
