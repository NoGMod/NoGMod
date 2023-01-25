package com.nog.swordmod.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.nog.swordmod.SwordMod;
import com.nog.swordmod.block.ExampleBlock;
import com.nog.swordmod.block.Kortium_Block;
import com.nog.swordmod.block.Trampolin;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			SwordMod.MOD_ID );
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
			() -> new ExampleBlock (BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE).strength(3.0f)
					.sound(SoundType.METAL).requiresCorrectToolForDrops().emissiveRendering((state, getter, pos) -> {
						return pos.getX() == 50;
					}).jumpFactor(3).lightLevel(state -> 100)),
		
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Block> TRAMPOLIN = register("trampolin",
			() -> new Trampolin(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.METAL).jumpFactor(3)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
	
	public static final RegistryObject<Block> KORTIUM_BLOCK = register("kortium_block",
			() -> new Kortium_Block(BlockBehaviour.Properties.copy(Blocks.HAY_BLOCK).noOcclusion().requiresCorrectToolForDrops().sound(SoundType.METAL)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(SwordMod.TUTORIAL_TAB)));
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, 
			final Supplier<? extends T> block){
		return BLOCKS.register(name, block);
	}
		
		private static <T extends Block> RegistryObject<T> register(final String name,final Supplier<? extends T> block,
				Function<RegistryObject<T>, Supplier<? extends Item>> item) {
				
			RegistryObject<T> obj = registerBlock(name, block);
			ITEMS.register(name, item.apply(obj));
			return obj;
		}

	
}
