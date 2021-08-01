
package net.mcreator.ganjacraft;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.ganjacraft.item.IndicaBudItem;
import net.mcreator.ganjacraft.item.HempSmoothieItem;

@GanjacraftModElements.ModElement.Tag
public class HempSmoothieRecipeBrewingRecipe extends GanjacraftModElements.ModElement {
	public HempSmoothieRecipeBrewingRecipe(GanjacraftModElements instance) {
		super(instance, 98);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.POTION, (int) (1))),
				Ingredient.fromStacks(new ItemStack(IndicaBudItem.block, (int) (1))), new ItemStack(HempSmoothieItem.block, (int) (1)));
	}
}
