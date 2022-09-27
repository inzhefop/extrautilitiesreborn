
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;

public class PrecisionShearsItem extends ShearsItem {
	public PrecisionShearsItem() {
		super(new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).durability(0));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
		return 8f;
	}
}
