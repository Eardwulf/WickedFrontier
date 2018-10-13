package com.eardwulf.wickedfrontier.blocks.light;

import com.eardwulf.wickedfrontier.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CustomBlockLantern extends BlockBase 
{

	public CustomBlockLantern(String name, Material material, float light) 
	{
		super(name, material);
		setSoundType(SoundType.PLANT);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(light);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

}
