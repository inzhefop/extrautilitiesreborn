
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class EyeOfRedstoneItem extends Item {
	public EyeOfRedstoneItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
