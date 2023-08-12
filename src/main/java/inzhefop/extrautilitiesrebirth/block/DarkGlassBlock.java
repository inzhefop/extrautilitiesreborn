package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;

public class DarkGlassBlock extends ModAbstractGlassBlock {
	public DarkGlassBlock() {
		super();
		this.properties.color(MaterialColor.COLOR_BLACK);
	}

	@SuppressWarnings("deprecation")
	@Override
	public int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
		return worldIn.getMaxLightLevel();
	}

	@Override
	public boolean propagatesSkylightDown(@NotNull BlockState state, @NotNull BlockGetter reader, @NotNull BlockPos pos) {
		return false;
	}

}
