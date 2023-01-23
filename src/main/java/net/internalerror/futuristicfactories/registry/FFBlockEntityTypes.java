package net.internalerror.futuristicfactories.registry;

import static net.internalerror.futuristicfactories.FuturisticFactories.MOD_ID;

import java.util.function.Supplier;
import net.internalerror.futuristicfactories.FuturisticFactories;
import net.internalerror.futuristicfactories.block.machine.crushing.CrushingMachineBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FFBlockEntityTypes {

  private static final DeferredRegister<BlockEntityType<?>> register = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MOD_ID);

  public static final RegistryObject<BlockEntityType<CrushingMachineBlockEntity>> crushing_machine = register("crushing_machine", () -> BlockEntityType.Builder.of(CrushingMachineBlockEntity::new, FFBlocks.crushing_machine.get()).build(null));

  private static <T extends BlockEntityType<?>> RegistryObject<T> register(String pName, Supplier<T> pBlockEntityTypeSupplier) {
    FuturisticFactories.LOGGER.debug("Registering >> {}", pName);
    return register.register(pName, pBlockEntityTypeSupplier);
  }


  public static void register(IEventBus modEventBus) {
    register.register(modEventBus);
  }
}
