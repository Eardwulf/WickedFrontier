package com.eardwulf.wickedfrontier.init;

import java.util.ArrayList;
import java.util.List;

import com.eardwulf.wickedfrontier.blocks.BlockBase;
import com.eardwulf.wickedfrontier.blocks.CustomBlockStairs;
import com.eardwulf.wickedfrontier.blocks.AdobeBrick;
import com.eardwulf.wickedfrontier.blocks.GaiaStone;
import com.eardwulf.wickedfrontier.blocks.OrichalcumOre;
import com.eardwulf.wickedfrontier.blocks.fence.CustomBlockFence;
import com.eardwulf.wickedfrontier.blocks.fence.CustomBlockFenceGate;
import com.eardwulf.wickedfrontier.blocks.light.CustomBlockLantern;
import com.eardwulf.wickedfrontier.blocks.slab.AdobeDoubleSlab;
import com.eardwulf.wickedfrontier.blocks.slab.AdobeHalfSlab;
import com.eardwulf.wickedfrontier.blocks.slab.ArcaneDoubleSlab;
import com.eardwulf.wickedfrontier.blocks.slab.ArcaneHalfSlab;
import com.eardwulf.wickedfrontier.blocks.slab.CustomBlockSlab;
import com.eardwulf.wickedfrontier.blocks.trees.ArcaneLog;
import com.eardwulf.wickedfrontier.blocks.trees.ArcanePlanks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block GAIA_STONE = new GaiaStone("gaia_stone", Material.DRAGON_EGG);
	public static final Block ADOBE_BRICK = new AdobeBrick("adobe_brick", Material.ROCK);
	
	
	
	//Ores
	public static final Block ORICHALCUM_ORE = new OrichalcumOre("orichalcum_ore", Material.GLASS);
	
	
	
	//Trees
	public static final Block PLANKS_ARCANE = new ArcanePlanks("planks_arcane", Material.WOOD);
	public static final Block LOG_ARCANE = new ArcaneLog("log_arcane", Material.WOOD);
	
	
	
	//Stairs
	public static final Block ARCANE_STAIRS = new CustomBlockStairs ("arcane_stairs", PLANKS_ARCANE.getDefaultState(), 5.0F);
	public static final Block ADOBE_STAIRS = new CustomBlockStairs ("adobe_stairs", ADOBE_BRICK.getDefaultState(), 0.0F);
	
	
	//Slabs
	public static final CustomBlockSlab ARCANE_SLAB_HALF = new ArcaneHalfSlab("arcane_slab_half", 2.5F, 2.5F, 5.0F);
	public static final CustomBlockSlab ARCANE_SLAB_DOUBLE = new ArcaneDoubleSlab("arcane_slab_double", 2.5F, 2.5F, 5.0F);
	public static final CustomBlockSlab ADOBE_SLAB_HALF = new AdobeHalfSlab("adobe_slab_half", 2.5F, 2.5F, 0.0F);
	public static final CustomBlockSlab ADOBE_SLAB_DOUBLE = new AdobeDoubleSlab("adobe_slab_double", 2.5F, 2.5F, 0.0F);
	
	
	//Fences
	public static final CustomBlockFence ARCANE_FENCE = new CustomBlockFence("arcane_fence", 2.5F, 4.5F, 5.0F);
	public static final CustomBlockFenceGate ARCANE_FENCE_GATE = new CustomBlockFenceGate("arcane_fence_gate");
	public static final CustomBlockFence ADOBE_FENCE = new CustomBlockFence("adobe_fence", 2.5F, 4.5F, 0.0F);
	public static final CustomBlockFenceGate ADOBE_FENCE_GATE = new CustomBlockFenceGate("adobe_fence_gate");
	
	
	//Lanterns
	//public static final Block ADOBE_LANTERN = new CustomBlockLantern("adobe_lantern", Material.ROCK, 5.0F);
	//public static final Block BONE_LANTERN = new CustomBlockLantern("bone_lantern", Material.ROCK, 5.0F);
	public static final Block LANTERN_PAPER= new CustomBlockLantern("lantern_paper", Material.ROCK, 5.0F);
	
	
}
