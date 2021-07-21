
package net.mcreator.ganjacraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.ganjacraft.item.HempStemItem;
import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class HempStemFuelFuel extends GanjacraftModElements.ModElement {
	public HempStemFuelFuel(GanjacraftModElements instance) {
		super(instance, 49);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(HempStemItem.block, (int) (1)).getItem())
			event.setBurnTime(70);
	}
}
