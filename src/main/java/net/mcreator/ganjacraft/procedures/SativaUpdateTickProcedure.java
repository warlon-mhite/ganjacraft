package net.mcreator.ganjacraft.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.ganjacraft.block.SativacropBlock;
import net.mcreator.ganjacraft.block.Sativacrop7topBlock;
import net.mcreator.ganjacraft.block.Sativacrop7middleBlock;
import net.mcreator.ganjacraft.block.Sativacrop7Block;
import net.mcreator.ganjacraft.block.Sativacrop6topBlock;
import net.mcreator.ganjacraft.block.Sativacrop6middleBlock;
import net.mcreator.ganjacraft.block.Sativacrop6Block;
import net.mcreator.ganjacraft.block.Sativacrop5topBlock;
import net.mcreator.ganjacraft.block.Sativacrop5Block;
import net.mcreator.ganjacraft.block.Sativacrop4topBlock;
import net.mcreator.ganjacraft.block.Sativacrop4Block;
import net.mcreator.ganjacraft.block.Sativacrop3Block;
import net.mcreator.ganjacraft.block.Sativacrop2Block;
import net.mcreator.ganjacraft.block.Sativacrop1Block;
import net.mcreator.ganjacraft.block.HempcretePowderBlock;
import net.mcreator.ganjacraft.GanjacraftModElements;
import net.mcreator.ganjacraft.GanjacraftMod;

import java.util.Map;
import java.util.HashMap;

@GanjacraftModElements.ModElement.Tag
public class SativaUpdateTickProcedure extends GanjacraftModElements.ModElement {
	public SativaUpdateTickProcedure(GanjacraftModElements instance) {
		super(instance, 191);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency x for procedure SativaUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency y for procedure SativaUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency z for procedure SativaUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GanjacraftMod.LOGGER.warn("Failed to load dependency world for procedure SativaUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double randomGrowth = 0;
		if ((!(((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.FARMLAND.getDefaultState().getBlock())
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Sativacrop4Block.block.getDefaultState()
						.getBlock())
						|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Sativacrop5Block.block
								.getDefaultState().getBlock())
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Sativacrop6Block.block
										.getDefaultState().getBlock())
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Sativacrop7Block.block
												.getDefaultState().getBlock())
												|| (((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
														.getBlock() == Sativacrop6middleBlock.block.getDefaultState().getBlock())
														|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
																.getBlock() == Sativacrop7middleBlock.block.getDefaultState().getBlock()))))))))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SativacropBlock.block.getDefaultState().getBlock())
					|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop1Block.block.getDefaultState()
							.getBlock())
							|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop2Block.block.getDefaultState()
									.getBlock())
									|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop3Block.block
											.getDefaultState().getBlock())
											|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop4Block.block
													.getDefaultState().getBlock())
													|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))
															.getBlock() == Sativacrop6Block.block.getDefaultState().getBlock()))))))) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					GrowingCropBlowingByExplosionProcedure.executeProcedure($_dependencies);
				}
			} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop7Block.block.getDefaultState()
					.getBlock())) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					GrownCropByExplosionProcedure.executeProcedure($_dependencies);
				}
			}
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		} else if (((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SAND.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.RED_SAND.getDefaultState().getBlock()))
				|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.GRAVEL.getDefaultState().getBlock())
						|| ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.ANVIL.getDefaultState()
								.getBlock())
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.CHIPPED_ANVIL
										.getDefaultState().getBlock())
										|| ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.DAMAGED_ANVIL
												.getDefaultState().getBlock())))
								|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.WHITE_CONCRETE_POWDER
										.getDefaultState().getBlock())
										|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
												.getBlock() == Blocks.ORANGE_CONCRETE_POWDER.getDefaultState().getBlock())
												|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
														.getBlock() == Blocks.MAGENTA_CONCRETE_POWDER.getDefaultState().getBlock())
														|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																.getBlock() == Blocks.LIGHT_BLUE_CONCRETE_POWDER.getDefaultState().getBlock())
																|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																		.getBlock() == Blocks.YELLOW_CONCRETE_POWDER.getDefaultState().getBlock())
																		|| (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																				.getBlock() == Blocks.LIME_CONCRETE_POWDER.getDefaultState()
																						.getBlock())
																				|| (((world
																						.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
																								.getBlock() == Blocks.PINK_CONCRETE_POWDER
																										.getDefaultState().getBlock())
																						|| (((world.getBlockState(
																								new BlockPos((int) x, (int) (y + 1), (int) z)))
																										.getBlock() == Blocks.GRAY_CONCRETE_POWDER
																												.getDefaultState().getBlock())
																								|| (((world.getBlockState(new BlockPos((int) x,
																										(int) (y + 1), (int) z)))
																												.getBlock() == Blocks.LIGHT_GRAY_CONCRETE_POWDER
																														.getDefaultState().getBlock())
																										|| (((world.getBlockState(new BlockPos(
																												(int) x, (int) (y + 1), (int) z)))
																														.getBlock() == Blocks.CYAN_CONCRETE_POWDER
																																.getDefaultState()
																																.getBlock())
																												|| (((world.getBlockState(
																														new BlockPos((int) x,
																																(int) (y + 1),
																																(int) z)))
																																		.getBlock() == Blocks.PURPLE_CONCRETE_POWDER
																																				.getDefaultState()
																																				.getBlock())
																														|| (((world.getBlockState(
																																new BlockPos((int) x,
																																		(int) (y + 1),
																																		(int) z)))
																																				.getBlock() == Blocks.BLUE_CONCRETE_POWDER
																																						.getDefaultState()
																																						.getBlock())
																																|| (((world
																																		.getBlockState(
																																				new BlockPos(
																																						(int) x,
																																						(int) (y + 1),
																																						(int) z)))
																																								.getBlock() == Blocks.BROWN_CONCRETE_POWDER
																																										.getDefaultState()
																																										.getBlock())
																																		|| (((world
																																				.getBlockState(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y + 1),
																																								(int) z)))
																																										.getBlock() == Blocks.GREEN_CONCRETE_POWDER
																																												.getDefaultState()
																																												.getBlock())
																																				|| (((world
																																						.getBlockState(
																																								new BlockPos(
																																										(int) x,
																																										(int) (y + 1),
																																										(int) z)))
																																												.getBlock() == Blocks.RED_CONCRETE_POWDER
																																														.getDefaultState()
																																														.getBlock())
																																						|| (((world
																																								.getBlockState(
																																										new BlockPos(
																																												(int) x,
																																												(int) (y + 1),
																																												(int) z)))
																																														.getBlock() == Blocks.BLACK_CONCRETE_POWDER
																																																.getDefaultState()
																																																.getBlock())
																																								|| ((world
																																										.getBlockState(
																																												new BlockPos(
																																														(int) x,
																																														(int) (y + 1),
																																														(int) z)))
																																																.getBlock() == HempcretePowderBlock.block
																																																		.getDefaultState()
																																																		.getBlock()))))))))))))))))))))) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
						new BlockPos((int) x, (int) y, (int) z));
				world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
			}
		} else if (((!(world.isRemote())) && ((world.getLight(new BlockPos((int) x, (int) (y + 1), (int) z))) > 7))) {
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("growthTimer", ((new Object() {
						public double getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "growthTimer")) + 0.05));
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (((new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "growthTimer")) >= 450)) {
				randomGrowth = (double) Math.random();
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SativacropBlock.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop2Block.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop1Block.block.getDefaultState(), 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop1Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop3Block.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop2Block.block.getDefaultState(), 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop2Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop4Block.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop4topBlock.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop3Block.block.getDefaultState(), 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop3Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop5Block.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop5topBlock.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop4Block.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop4topBlock.block.getDefaultState(), 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop4Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop6Block.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop6middleBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Sativacrop6topBlock.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop5Block.block.getDefaultState(), 3);
						if (((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR.getDefaultState()
								.getBlock())) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop5topBlock.block.getDefaultState(), 3);
						}
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop5Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.66)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop7Block.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop7middleBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Sativacrop7topBlock.block.getDefaultState(), 3);
					} else if (((randomGrowth) >= 0.33)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop6Block.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop6middleBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Sativacrop6topBlock.block.getDefaultState(), 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Sativacrop6Block.block.getDefaultState()
						.getBlock())) {
					if (((randomGrowth) >= 0.5)) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Sativacrop7Block.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Sativacrop7middleBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Sativacrop7topBlock.block.getDefaultState(), 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("growthTimer", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
