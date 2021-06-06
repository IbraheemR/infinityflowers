package com.ibraheemrodrigues.iflowers;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class SelectivelyPlaceableFlower extends FlowerBlock {
    private FloorCheck floorCheck;

    public SelectivelyPlaceableFlower(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings, FloorCheck floorCheck) {
        super(suspiciousStewEffect, effectDuration, settings);
        this.floorCheck = floorCheck;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return this.floorCheck.test(floor, world, pos);
    }

    public interface FloorCheck {
        boolean test(BlockState floor, BlockView world, BlockPos pos);
    }
}
