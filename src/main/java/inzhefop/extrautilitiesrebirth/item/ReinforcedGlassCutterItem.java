
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import inzhefop.extrautilitiesrebirth.procedures.GlassCutterRightclickedOnBlockProcedure;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class ReinforcedGlassCutterItem extends Item {
	public ReinforcedGlassCutterItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		GlassCutterRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()), context.getPlayer(),
				context.getItemInHand());
		return retval;
	}
}
