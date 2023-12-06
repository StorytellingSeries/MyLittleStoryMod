package ru.storyteam.mylittlestory.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.zeith.hammerlib.annotations.RegistryName;
import org.zeith.hammerlib.annotations.SimplyRegister;
import ru.storyteam.mylittlestory.content.blocks.MetalBlock;

@SimplyRegister
public interface StoryBlocks {
    @RegistryName("metal_block")
    MetalBlock METAL_BLOCK = new MetalBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK));
}
