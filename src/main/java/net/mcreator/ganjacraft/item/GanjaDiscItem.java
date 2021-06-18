
package net.mcreator.ganjacraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.ganjacraft.itemgroup.GanjaCraftCreativeTabItemGroup;
import net.mcreator.ganjacraft.GanjacraftModElements;

import java.util.List;

@GanjacraftModElements.ModElement.Tag
public class GanjaDiscItem extends GanjacraftModElements.ModElement {
	@ObjectHolder("ganjacraft:ganjadisc")
	public static final Item block = null;
	public GanjaDiscItem(GanjacraftModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, GanjacraftModElements.sounds.get(new ResourceLocation("ganjacraft:ganjadisc")),
					new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ganjadisc");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Credit : Mr Pink by Topher Mohr & AlexElena"));
		}
	}
}
