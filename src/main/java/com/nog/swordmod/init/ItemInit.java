package com.nog.swordmod.init;



import com.google.common.base.Supplier;
import com.nog.swordmod.SwordMod;
import com.nog.swordmod.item.KortiumDust;
import com.nog.swordmod.item.KortiumEnchantedIngot;
import com.nog.swordmod.item.KortiumIngot;
import com.nog.swordmod.item.ModArmorMaterials;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = 
			DeferredRegister.create(ForgeRegistries.ITEMS,
			SwordMod.MOD_ID );
	
	// Items wie z.b. Kortium und so
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item",
			() -> new Item(new Item.Properties().tab(SwordMod.TUTORIAL_TAB).stacksTo(1)));
	
	public static final RegistryObject<Item> KORTIUM_DUST = ITEMS.register("kortium_dust",
			() -> new KortiumDust(new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> KORTIUM_INGOT = ITEMS.register("kortium_ingot",
			() -> new KortiumIngot(new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> KORTIUM_ENCHANTED_INGOT = ITEMS.register("kortium_enchanted_ingot",
			() -> new KortiumEnchantedIngot(new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
	
	//	Ab hier ist dann Armor stuff
	public static final RegistryObject<ArmorItem> KORTIUM_HELMET = ITEMS.register("kortium_helmet",
			() -> new ArmorItem(ModArmorMaterials.KORTIUM, EquipmentSlot.HEAD,
					new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<ArmorItem> KORTIUM_CHESTPLATE = ITEMS.register("kortium_chestplate",
			() -> new ArmorItem(ModArmorMaterials.KORTIUM, EquipmentSlot.CHEST,
					new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
			
	public static final RegistryObject<ArmorItem> KORTIUM_LEGGING = ITEMS.register("kortium_legging",
			() -> new ArmorItem(ModArmorMaterials.KORTIUM, EquipmentSlot.LEGS,
					new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
			
	public static final RegistryObject<ArmorItem> KORTIUM_BOOTS = ITEMS.register("kortium_boots",
			() -> new ArmorItem(ModArmorMaterials.KORTIUM, EquipmentSlot.FEET,
					new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
			
			

		
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}


}
