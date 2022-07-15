package net.ghostyy.better_minecraft.block.custom;

import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ModButtonBlock extends AbstractButtonBlock {

    public int pressTicks;

    public ModButtonBlock(int pressTicks, Settings settings) {
        super(false, settings);
        this.pressTicks = pressTicks;
    }

    private int getPressTicks() {
        return this.pressTicks;
    }

    @Override
    public void powerOn(BlockState state, World world, BlockPos pos) {
        world.setBlockState(pos, (BlockState)state.with(POWERED, true), Block.NOTIFY_ALL);
        this.updateNeighbors(state, world, pos);
        world.createAndScheduleBlockTick(pos, this, this.getPressTicks());
    }

    private void updateNeighbors(BlockState state, World world, BlockPos pos) {
        world.updateNeighborsAlways(pos, this);
        world.updateNeighborsAlways(pos.offset(AbstractButtonBlock.getDirection(state).getOpposite()), this);
    }

    @Override
    protected SoundEvent getClickSound(boolean powered) {
        return powered ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }
}
