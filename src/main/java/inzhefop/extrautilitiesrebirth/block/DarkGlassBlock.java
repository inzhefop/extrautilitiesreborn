package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

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

	@Override
	public void appendHoverText(@NotNull ItemStack itemStack, @Nullable BlockGetter world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
		super.appendHoverText(itemStack, world, list, flag);
		list.add(new TranslatableComponent("tooltip.extrautilitiesrebirth.dark_glass").withStyle(ChatFormatting.GRAY));
	}

}
