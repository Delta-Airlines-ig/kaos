package net.aristokrats.kaos.block;

import net.aristokrats.kaos;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {

    public static void registerModBlocks() {
        kaos.LOGGER.info("Registering Modblocks for " +
    kaos.MOD_ID
        )
    }

    public static Block RUBY_BLOCK = registerBlock("ruby_block", 
    new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)))

    private static Block registerBlcok(String name, Block block) {
        registerBlockItem(name, block);
        return Registery.register(Registries.BLOCK, Identifier.of(Tutorial.MOD_ID, name), block);
        }

        
            
}


