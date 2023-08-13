package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class ReinforcedDarkGlassBlock extends DarkGlassBlock {
	public ReinforcedDarkGlassBlock() {
		super();
		this.properties.strength(0.1f, 8000f);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack itemStack, @Nullable BlockGetter world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
		super.appendHoverText(itemStack, world, list, flag);
		list.add(new TranslatableComponent("tooltip.extrautilitiesrebirth.reinforced_dark_glass").withStyle(ChatFormatting.GRAY));
	}

}
