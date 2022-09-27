package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class OverworldPortalEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, (x + 0.5), (y + 1.5), (z + 0.5), 1, 0.2, 0.2, 0.2, 0);
	}
}
