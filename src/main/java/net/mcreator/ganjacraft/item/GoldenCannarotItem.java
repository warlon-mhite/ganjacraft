
package net.mcreator.ganjacraft.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.ganjacraft.procedures.StartTimerGCProcedure;
import net.mcreator.ganjacraft.itemgroup.GanjaCraftCreativeTabItemGroup;
import net.mcreator.ganjacraft.GanjacraftModElements;

import java.util.Map;
import java.util.HashMap;

@GanjacraftModElements.ModElement.Tag
public class GoldenCannarotItem extends GanjacraftModElements.ModElement {
	@ObjectHolder("ganjacraft:goldencannarot")
	public static final Item block = null;
	public GoldenCannarotItem(GanjacraftModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(6).saturation(14.4f).setAlwaysEdible().build()));
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

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				StartTimerGCProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
