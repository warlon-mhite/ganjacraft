
package net.mcreator.ganjacraft.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.ganjacraft.block.HempBaleBlock;
import net.mcreator.ganjacraft.GanjacraftModElements;

@GanjacraftModElements.ModElement.Tag
public class HempBaleFuelFuel extends GanjacraftModElements.ModElement {
	public HempBaleFuelFuel(GanjacraftModElements instance) {
		super(instance, 65);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(HempBaleBlock.block, (int) (1)).getItem())
			event.setBurnTime(420);
	}
}
