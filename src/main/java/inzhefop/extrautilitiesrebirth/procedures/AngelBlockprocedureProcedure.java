package inzhefop.extrautilitiesrebirth.procedures;

import inzhefop.extrautilitiesrebirth.ExtrautilitiesrebirthMod;
import inzhefop.extrautilitiesrebirth.block.AngelBlockBlock;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModBlocks;
import inzhefop.extrautilitiesrebirth.init.ExtrautilitiesrebirthModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExtrautilitiesrebirthMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class AngelBlockprocedureProcedure {

    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        ItemStack stack = event.getItemStack();
        Item item = stack.getItem();
        if (item == ExtrautilitiesrebirthModItems.ANGEL_BLOCK.get()) {
            execute(event.getPlayer(), event.getPlayer().getLevel(), event.getHand());
        }
    }

    private static void execute(Player player, Level level, InteractionHand hand) {
        if (!level.isClientSide) {
            Vec3 look = player.getLookAngle();
            double distance = 3.0;
            Vec3 offset = look.scale(distance);
            Vec3 startPos = player.getEyePosition();
            Vec3 endPos = startPos.add(offset);

            ClipContext context = new ClipContext(startPos, endPos, ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, player);
            BlockPos blockPos = player.level.clip(context).getBlockPos();

            int y = Math.max(blockPos.getY(), level.getMinBuildHeight());
            BlockPos pos = new BlockPos(blockPos.getX(), y, blockPos.getZ());

            if (level.isInWorldBounds(pos) && level.getBlockState(pos).getMaterial().isReplaceable()) {
                Direction direction = player.getDirection();
                BlockState blockState = ExtrautilitiesrebirthModBlocks.ANGEL_BLOCK.get().defaultBlockState().setValue(AngelBlockBlock.FACING, direction);
                level.setBlock(pos, blockState, 3);

                if (!player.isCreative()) {
                    if (hand == InteractionHand.MAIN_HAND) {
                        player.getInventory().removeFromSelected(false);
                    } else {
                        player.getInventory().removeItem(Inventory.SLOT_OFFHAND, 1);
                    }
                }
            }
        }
    }

}
