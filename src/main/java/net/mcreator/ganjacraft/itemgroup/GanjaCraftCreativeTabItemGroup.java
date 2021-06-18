
package net.mcreator.ganjacraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.ganjacraft.item.IndicaBongItem;
import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class GanjaCraftCreativeTabItemGroup extends GanjacraftModElements.ModElement {
	public GanjaCraftCreativeTabItemGroup(GanjacraftModElements instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabganjacraftcreativetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IndicaBongItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
