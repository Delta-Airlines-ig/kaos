package net.aristokrats.kaos.item;
//test of if I can change the code in github
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.aristokrats.kaos.Kaos;
import net.aristokrats.kaos.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
   public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
           Identifier.of(Kaos.MOD_ID, "ruby"),
           FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                   .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entires) -> {
                       entires.add(ModItems.RUBY);
                       //entires.add(ModItems.RAW_RUBY);
                       ModBlocks.registerModBlocks();



                   }).build());


   public static void registerItemGroups() {
       TutorialMod.LOGGER.info("Register Item Groups for " + TutorialMod.MOD_ID);
    }
}
