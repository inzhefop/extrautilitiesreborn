
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModItems;

public class ReversingHoeItem extends HoeItem {
	public ReversingHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ExtrautilitiesrebirthModItems.UNSTABLE_INGOT.get()));
			}
		}, 0, 16f, new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB));
	}
}
