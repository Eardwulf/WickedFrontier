package com.eardwulf.wickedfrontier.blocks;

import java.awt.List;
import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class LanternPaper extends BlockBase
{

	private static final AxisAlignedBB BOUNDING_BOX = null;



	public LanternPaper(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(1.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(10.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

	 @Override

	    public boolean isOpaqueCube(IBlockState state)

	    {

	        return false;

	    }



	    @Override

	    public boolean isFullCube(IBlockState state)

	    {

	        return false;

	    }



	    @Override

	    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)

	    {

	        return BOUNDING_BOX;

	    }

	}