package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class EnderMarkerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "complete")) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, (x + 0.5), (y + 0.75), (z + 0.5), 5, 0.1, 0.1, 0.1, 0);
		}
	}
}
