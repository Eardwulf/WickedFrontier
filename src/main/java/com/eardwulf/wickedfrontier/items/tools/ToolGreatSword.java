package com.eardwulf.wickedfrontier.items.tools;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.items.IExtendedReach;
import com.eardwulf.wickedfrontier.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.world.storage.loot.functions.SetDamage;

public class ToolGreatSword extends ItemSword implements IHasModel, IExtendedReach
{

	public ToolGreatSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabwickedfrontier);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	public Item increaseItemDamage()
	{
		return setMaxDamage(+ 6);
	}

	@Override
	public float getReach()
	{
		return 40.0F;
	}
	
}


