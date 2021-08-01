
package net.mcreator.ganjacraft.item;

@GanjacraftModElements.ModElement.Tag
public class SativaBudItem extends GanjacraftModElements.ModElement {

	@ObjectHolder("ganjacraft:sativa_bud")
	public static final Item block = null;

	public SativaBudItem(GanjacraftModElements instance) {
		super(instance, 13);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("sativa_bud");
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
