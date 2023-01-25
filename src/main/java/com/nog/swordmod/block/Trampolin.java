package com.nog.swordmod.block;




import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;



public class Trampolin extends Block {
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
	
	public Trampolin(Properties properties) {
		super(properties);
	
	}

	private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 8, 16);
		
	
	
	@Override
	public VoxelShape getShape(BlockState state, BlockGetter Level, BlockPos Pos, CollisionContext Context) {
		return SHAPE;
		
	}
}
	
	
		

			
	


