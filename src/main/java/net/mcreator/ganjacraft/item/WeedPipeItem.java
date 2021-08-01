
package net.mcreator.ganjacraft.item;

@GanjacraftModElements.ModElement.Tag
public class WeedPipeItem extends GanjacraftModElements.ModElement {

	@ObjectHolder("ganjacraft:weed_pipe")
	public static final Item block = null;

	public WeedPipeItem(GanjacraftModElements instance) {
		super(instance, 15);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("weed_pipe");
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

	}

}
