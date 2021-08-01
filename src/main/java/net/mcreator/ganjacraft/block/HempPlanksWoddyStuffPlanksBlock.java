
package net.mcreator.ganjacraft.block;

import net.minecraft.block.material.Material;

@GanjacraftModElements.ModElement.Tag
public class HempPlanksWoddyStuffPlanksBlock extends GanjacraftModElements.ModElement {

	@ObjectHolder("ganjacraft:hemp_planks_woddy_stuff_planks")
	public static final Block block = null;

	public HempPlanksWoddyStuffPlanksBlock(GanjacraftModElements instance) {
		super(instance, 33);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(GanjaCraftCreativeTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.AXE).setRequiresTool());

			setRegistryName("hemp_planks_woddy_stuff_planks");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
