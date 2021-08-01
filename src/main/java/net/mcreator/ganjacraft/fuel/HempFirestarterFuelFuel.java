
package net.mcreator.ganjacraft.fuel;

@GanjacraftModElements.ModElement.Tag
public class HempFirestarterFuelFuel extends GanjacraftModElements.ModElement {

	public HempFirestarterFuelFuel(GanjacraftModElements instance) {
		super(instance, 214);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(HempFirestraterItem.block, (int) (1)).getItem())
			event.setBurnTime(2000);
	}

}
