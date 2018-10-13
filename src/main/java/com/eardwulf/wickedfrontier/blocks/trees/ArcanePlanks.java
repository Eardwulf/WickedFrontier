package com.eardwulf.wickedfrontier.blocks.trees;

import com.eardwulf.wickedfrontier.blocks.BlockBase;
import com.eardwulf.wickedfrontier.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ArcanePlanks extends BlockBase
{
	public ArcanePlanks(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.WOOD);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("axe", 0);
		setLightLevel(5.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}