
package net.mcreator.ganjacraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.ganjacraft.itemgroup.GanjaCraftCreativeTabItemGroup;
import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class HempSmoothieItem extends GanjacraftModElements.ModElement {
	@ObjectHolder("ganjacraft:hempsmoothie")
	public static final Item block = null;
	public HempSmoothieItem(GanjacraftModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(1.2f).setAlwaysEdible().build()));
			setRegistryName("hempsmoothie");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}
	}
}
