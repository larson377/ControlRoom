package net.mcreator.controlroom.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.controlroom.block.RecieverBlock;
import net.mcreator.controlroom.block.ControlLeverOnBlock;
import net.mcreator.controlroom.block.ControlLeverBlock;
import net.mcreator.controlroom.ControlRoomModVariables;
import net.mcreator.controlroom.ControlRoomMod;

import java.util.Map;

public class PrecisionScrewdriverRightClickedOnBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency entity for procedure PrecisionScrewdriverRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency x for procedure PrecisionScrewdriverRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency y for procedure PrecisionScrewdriverRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency z for procedure PrecisionScrewdriverRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ControlRoomMod.LOGGER.warn("Failed to load dependency world for procedure PrecisionScrewdriverRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ControlLeverOnBlock.block)) {
			{
				double _setval = (double) x;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_x = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) y;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) z;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity)
						.sendStatusMessage(new StringTextComponent(((((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_x))
								+ ""
								+ (((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_y))
								+ "" + (((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_z)))),
								(false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Settings saved!"), (true));
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ControlLeverBlock.block)) {
			{
				double _setval = (double) x;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_x = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) y;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) z;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity)
						.sendStatusMessage(new StringTextComponent(((((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_x))
								+ ""
								+ (((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_y))
								+ "" + (((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_z)))),
								(false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Settings saved!"), (true));
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == RecieverBlock.block)) {
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("linkedX", ((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_x));
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("linkedY", ((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_y));
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putDouble("linkedZ", ((entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ControlRoomModVariables.PlayerVariables())).screwdriver_z));
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Block data inputted!"), (true));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Stored information:"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((((new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "linkedX"))) + "" + ((new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "linkedY"))) + "" + ((new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "linkedZ"))))), (false));
			}
		} else {
			{
				double _setval = (double) 0;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_x = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 0;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_y = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 0;
				entity.getCapability(ControlRoomModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.screwdriver_z = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Screwdriver settings cleared!"), (true));
			}
		}
	}
}
