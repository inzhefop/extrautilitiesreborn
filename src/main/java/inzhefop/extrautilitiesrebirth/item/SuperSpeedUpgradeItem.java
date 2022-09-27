
package inzhefop.extrautilitiesrebirth.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class SuperSpeedUpgradeItem extends Item {
	public SuperSpeedUpgradeItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
