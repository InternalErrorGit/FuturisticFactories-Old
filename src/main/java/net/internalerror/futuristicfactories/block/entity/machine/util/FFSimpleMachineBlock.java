package net.internalerror.futuristicfactories.block.entity.machine.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class FFSimpleMachineBlock<T extends BlockEntity> extends BaseEntityBlock {
  
  public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
  
  protected FFSimpleMachineBlock(Properties pProperties) {
    super(pProperties);
  }
  
  @Override
  protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockStateBuilder) {
    blockStateBuilder.add(FACING);
  }
  
  @Nullable
  @Override
  public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
    return defaultBlockState().setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite());
  }
  
  @Override
  public @NotNull BlockState rotate(BlockState blockState, Rotation rotation) {
    return blockState.setValue(FACING, rotation.rotate(blockState.getValue(FACING)));
  }
  
  @Override
  public @NotNull BlockState mirror(BlockState blockState, Mirror mirror) {
    return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
  }
  
  @Override
  public @NotNull RenderShape getRenderShape(@NotNull BlockState blockState) {
    return RenderShape.MODEL;
  }
  
  @Override
  public void onRemove(BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, BlockState newBlockState, boolean isMoving) {
    if (blockState.getBlock() != newBlockState.getBlock()) {
      BlockEntity blockEntity = level.getBlockEntity(blockPos);
      if (blockEntity instanceof FFSimpleMachineBlockEntity) {
        ((FFSimpleMachineBlockEntity) blockEntity).drops();
      }
    }
    super.onRemove(blockState, level, blockPos, newBlockState, isMoving);
  }
  
  @Override
  public @NotNull InteractionResult use(@NotNull BlockState blockState, Level level, @NotNull BlockPos blockPos, @NotNull Player player, @NotNull InteractionHand interactionHand, @NotNull BlockHitResult blockHitResult) {
    
    if (!level.isClientSide()) {
      BlockEntity entity = level.getBlockEntity(blockPos);
      if (entity instanceof FFSimpleMachineBlockEntity) {
        openScreen(player, entity, blockPos);
      } else {
        throw new IllegalStateException("ContainerProvider is missing!");
      }
    }
    
    return InteractionResult.sidedSuccess(level.isClientSide());
  }
  
  protected abstract void openScreen(Player player, BlockEntity entity, BlockPos blockPos);
  
  @Nullable
  public <S extends BlockEntity> BlockEntityTicker<S> getTicker(@NotNull Level level, @NotNull BlockState blockState, @NotNull BlockEntityType<S> blockEntityType) {
    return createTickerHelper(blockEntityType, getBlockEntityType(), getTickMethod());
  }
  
  protected abstract BlockEntityTicker<T> getTickMethod();
  
  
  public abstract BlockEntityType<T> getBlockEntityType();
  
}
