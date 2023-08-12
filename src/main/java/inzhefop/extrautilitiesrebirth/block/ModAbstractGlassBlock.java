package inzhefop.extrautilitiesrebirth.block;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class ModAbstractGlassBlock extends AbstractGlassBlock {

    protected ModAbstractGlassBlock() {
        super(BlockBehaviour.Properties.of(Material.GLASS)
                .sound(SoundType.GLASS)
                .strength(0.1f, 15f)
                .noOcclusion()
                .isRedstoneConductor((blockState, blockGetter, blockPos) -> false)
                .isValidSpawn((blockState, blockGetter, blockPos, entityType) -> false)
                .isSuffocating((blockState, blockGetter, blockPos) -> false)
                .isViewBlocking((blockState, blockGetter, blockPos) -> false)
        );
    }

    @SuppressWarnings("deprecation")
    @Override
    public @NotNull List<ItemStack> getDrops(@NotNull BlockState state, LootContext.@NotNull Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }

}
