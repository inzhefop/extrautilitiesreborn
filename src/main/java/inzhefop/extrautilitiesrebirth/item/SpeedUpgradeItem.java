
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class SpeedUpgradeItem extends Item {
	public SpeedUpgradeItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).stacksTo(4).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
