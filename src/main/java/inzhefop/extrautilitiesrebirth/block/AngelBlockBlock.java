package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.NotNull;

public class AngelBlockBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public AngelBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE)
				.sound(SoundType.STONE)
				.strength(5f, 8000f));
		this.registerDefaultState(this.stateDefinition.any()
				.setValue(FACING, Direction.NORTH));
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getLightBlock(@NotNull BlockState state, BlockGetter world, @NotNull BlockPos pos) {
		return world.getMaxLightLevel();
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState()
				.setValue(FACING, context.getHorizontalDirection());
	}

	@SuppressWarnings("deprecation")
	@Override
	public @NotNull BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	@SuppressWarnings("deprecation")
	@Override
	public @NotNull BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
		if (!player.isCreative()) {
			player.getInventory().placeItemBackInInventory(this.asItem().getDefaultInstance(), true);
		}
		return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
	}
}
