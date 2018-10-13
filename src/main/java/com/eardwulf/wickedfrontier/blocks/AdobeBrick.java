package com.eardwulf.wickedfrontier.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdobeBrick extends BlockBase
{

	public AdobeBrick(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0);
		//setLightLevel(0.5F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
