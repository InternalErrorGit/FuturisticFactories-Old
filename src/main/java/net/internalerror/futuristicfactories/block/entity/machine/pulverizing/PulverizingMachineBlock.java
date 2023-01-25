package net.internalerror.futuristicfactories.block.entity.machine.pulverizing;


import net.internalerror.futuristicfactories.block.entity.machine.util.FFSimpleMachineBlock;
import net.internalerror.futuristicfactories.registry.FFBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PulverizingMachineBlock extends FFSimpleMachineBlock<PulverizingMachineBlockEntity> {
  
  public PulverizingMachineBlock(Properties pProperties) {
    super(pProperties);
  }
  
  @Override
  protected void openScreen(Player player, BlockEntity entity, BlockPos blockPos) {
    NetworkHooks.openScreen((ServerPlayer) player, (PulverizingMachineBlockEntity) entity, blockPos);
  }
  
  @Override
  protected BlockEntityTicker<PulverizingMachineBlockEntity> getTickMethod() {
    return PulverizingMachineBlockEntity::tick;
  }
  
  @Override
  public BlockEntityType<PulverizingMachineBlockEntity> getBlockEntityType() {
    return FFBlockEntityTypes.pulverizing_machine.get();
  }
  
  @Nullable
  @Override
  public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
    return new PulverizingMachineBlockEntity(blockPos, blockState);
  }
}
