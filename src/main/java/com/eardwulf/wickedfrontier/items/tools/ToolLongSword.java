package com.eardwulf.wickedfrontier.items.tools;

import com.eardwulf.wickedfrontier.Main;
import com.eardwulf.wickedfrontier.init.ModItems;
import com.eardwulf.wickedfrontier.items.IExtendedReach;
import com.eardwulf.wickedfrontier.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.world.storage.loot.functions.SetDamage;

public class ToolLongSword extends ItemSword implements IHasModel,IExtendedReach
{

		public ToolLongSword(String name, ToolMaterial material)
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
		return setMaxDamage(+ 3);
	}

	@Override
	public float getReach() {
		// TODO Auto-generated method stub
		return 30.0F;
	}
}
