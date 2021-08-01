
package net.mcreator.ganjacraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.ganjacraft.procedures.HempBrickCraftedAdvancementProcedure;
import net.mcreator.ganjacraft.itemgroup.GanjaCraftCreativeTabItemGroup;
import net.mcreator.ganjacraft.GanjacraftModElements;

import java.util.Map;
import java.util.HashMap;

@GanjacraftModElements.ModElement.Tag
public class HempBrickItem extends GanjacraftModElements.ModElement {
	@ObjectHolder("ganjacraft:hempbrick")
	public static final Item block = null;
	public HempBrickItem(GanjacraftModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("hempbrick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
			super.onCreated(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				HempBrickCraftedAdvancementProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
