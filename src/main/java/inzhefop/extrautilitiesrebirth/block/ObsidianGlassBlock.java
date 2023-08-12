package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ObsidianGlassBlock extends ModAbstractGlassBlock {
	public ObsidianGlassBlock() {
		super();
		this.properties.strength(0.1f, 1200f);
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
		return 4;
	}

}
