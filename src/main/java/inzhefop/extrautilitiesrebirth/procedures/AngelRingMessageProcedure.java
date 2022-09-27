package inzhefop.extrautilitiesrebirth.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class AngelRingMessageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent("Download: =>\u00A7bhttps://www.curseforge.com/minecraft/mc-mods/angel-ring"), (false));
	}
}
