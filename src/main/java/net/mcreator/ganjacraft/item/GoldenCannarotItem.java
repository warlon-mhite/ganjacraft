
package net.mcreator.ganjacraft.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.ganjacraft.itemgroup.GanjaCraftCreativeTabItemGroup;
import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class GoldenCannarotItem extends GanjacraftModElements.ModElement {
	@ObjectHolder("ganjacraft:goldencannarot")
	public static final Item block = null;
	public GoldenCannarotItem(GanjacraftModElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(14.2f).setAlwaysEdible().build()));
			setRegistryName("goldencannarot");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
