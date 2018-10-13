package com.eardwulf.wickedfrontier.blocks;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModBlocks;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.util.IHasModel;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class CustomBlockStairs extends BlockStairs implements IHasModel
{

	public CustomBlockStairs(String name, IBlockState modelState, float light) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		setLightLevel(light);
		setCreativeTab(Main.tabwickedfrontier);
		
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
