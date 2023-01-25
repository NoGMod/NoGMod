package com.nog.swordmod;

import com.nog.swordmod.init.BlockInit;
import com.nog.swordmod.init.ItemInit;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("swordmod")
public class SwordMod {

	public static final String MOD_ID = "swordmod";

	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			// TODO Auto-generated method stub
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};
	
	public SwordMod() {
	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
	
	
	
	ItemInit.ITEMS.register(bus);
	BlockInit.BLOCKS.register(bus);
	
	  MinecraftForge.EVENT_BUS.register(this);

	  
	}

	public static ItemLike get() {
		// TODO Auto-generated method stub
		return null;
	}
}


