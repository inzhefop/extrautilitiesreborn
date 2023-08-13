package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.EntityCollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;

public class EtherealGlassBlock extends ModAbstractGlassBlock {
	public EtherealGlassBlock() {
		super();
		this.properties.noCollission();
	}

	@SuppressWarnings("deprecation")
	@Override
	public @NotNull VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull CollisionContext context) {
		if(context instanceof EntityCollisionContext && ((EntityCollisionContext)context).getEntity() instanceof Player player) {
			if(player.isShiftKeyDown()) {
				return state.getShape(world, pos);
			}
			return Shapes.empty();
		}
		return state.getShape(world, pos);
	}

	@Override
	public void appendHoverText(@NotNull ItemStack itemStack, @Nullable BlockGetter world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
		super.appendHoverText(itemStack, world, list, flag);
		list.add(new TranslatableComponent("tooltip.extrautilitiesrebirth.etherial_glass").withStyle(ChatFormatting.GRAY));
	}

}
