package net.aristokrats.kaos.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.aristokrats.kaos.Kaos;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

   //add items to each group. must be done for every item
   private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
       entries.add(RUBY);
   }

   private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, Identifier.of(Kaos.MOD_ID, name), item);
   }

   public static void registerModItems() {
       Kaos.LOGGER.info("Registering Mod Items for " + Kaos.MOD_ID);
       //add any item groups here
       ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((ModItems::addItemsToIngredientItemGroup));
    }
}