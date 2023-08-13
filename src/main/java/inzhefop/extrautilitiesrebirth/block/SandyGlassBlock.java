package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;

public class SandyGlassBlock extends ModAbstractGlassBlock {
	public SandyGlassBlock() {
		super();
		this.properties.strength(1f, 10f);
		this.properties.color(MaterialColor.SAND);
	}

	@Override
	public boolean shouldDisplayFluidOverlay(BlockState state, BlockAndTintGetter world, BlockPos pos, FluidState fluidstate) {
		return true;
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getLightBlock(@NotNull BlockState state, BlockGetter worldIn, @NotNull BlockPos pos) {
		return worldIn.getMaxLightLevel();
	}

}
