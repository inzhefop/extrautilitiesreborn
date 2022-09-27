
package inzhefop.extrautilitiesrebirth.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModTabs;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModItems;

public class HealingAxeItem extends AxeItem {
	public HealingAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
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
		}, 1, 1f, new Item.Properties().tab(ExtrautilitiesrebirthModTabs.TAB_TAB).fireResistant());
	}
}
