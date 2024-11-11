package net.aristokrats.kaos.block;

import net.aristokrats.kaos.Kaos;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

public static final Block RUBY_BLOCK = registerBlock("ruby_block",
       new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

 public static final RegistryObject<Block> FAX_MACHINE = registerBlock("fax_machine",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops().sound(SoundType.COPPER)));
   
   private static Block registerBlock(String name, Block block) {
       registerBlockItem(name, block);
       return Registry.register(Registries.BLOCK, Identifier.of(Kaos.MOD_ID, name), block);
   }

   private static Item registerBlockItem(String name, Block block) {
       return Registry.register(Registries.ITEM, Identifier.of(Kaos.MOD_ID, name),
           new BlockItem(block, new Item.Settings()));
   }

   public static void registerModBlocks() {
       Kaos.LOGGER.info("Registering ModBlocks for " + Kaos.MOD_ID);
   }
   
}
