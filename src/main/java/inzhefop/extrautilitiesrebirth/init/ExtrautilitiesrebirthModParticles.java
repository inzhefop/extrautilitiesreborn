
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package inzhefop.extrautilitiesrebirth.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import inzhefop.extrautilitiesrebirth.client.particle.RainbowParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ExtrautilitiesrebirthModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) ExtrautilitiesrebirthModParticleTypes.RAINBOW_PARTICLE.get(),
				RainbowParticleParticle::provider);
	}
}
