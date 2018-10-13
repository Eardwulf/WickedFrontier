package com.eardwulf.wickedfrontier.blocks;

import java.util.Random;

import com.eardwulf.wickedfrontier.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class GaiaStone extends BlockBase 
{

	public GaiaStone(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.PLANT);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.5F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.NATURE_STONE;
	}
	
	@Override
	public int quantityDropped(Random rand) 
	{
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
