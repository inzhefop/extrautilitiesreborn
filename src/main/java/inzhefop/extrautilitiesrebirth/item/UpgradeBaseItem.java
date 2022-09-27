
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class UpgradeBaseItem extends Item {
	public UpgradeBaseItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A77Resonator: Weighted Pressure Plate [8000 FE]"));
	}
}
