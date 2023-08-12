package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;

public class GlowstoneGlassBlock extends ModAbstractGlassBlock {
	public GlowstoneGlassBlock() {
		super();
		this.properties.color(MaterialColor.SAND);
	}

	@Override
	public int getLightEmission(BlockState state, BlockGetter world, BlockPos pos) {
		return 15;
	}

}
