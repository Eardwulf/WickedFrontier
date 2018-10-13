package com.eardwulf.wickedfrontier.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init()
	{
		GameRegistry.addSmelting(ModItems.ORICHALCUM_DUST, new ItemStack(ModItems.ORICHALCUM_INGOT, 1), 5.0F);
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.OBSIDIAN_INGOT, 1), 3.0F);
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(Items.LEATHER, 1), 1.0F);
		GameRegistry.addSmelting(Items.REDSTONE, new ItemStack(ModItems.REDSTONE_INGOT, 1), 3.5F);
		GameRegistry.addSmelting(Items.QUARTZ, new ItemStack(ModItems.QUARTZ_INGOT, 1), 2.5F);
		
	}
}
