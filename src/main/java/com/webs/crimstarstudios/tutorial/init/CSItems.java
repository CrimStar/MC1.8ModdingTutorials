package com.webs.crimstarstudios.tutorial.init;

import com.webs.crimstarstudios.tutorial.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CSItems {
	
	public static Item topaz;
	
	public static void init(){
		
		topaz = new Item().setUnlocalizedName("topaz");
		
	}
	
	public static void register(){
		
		GameRegistry.registerItem(topaz, topaz.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders(){
		
		registerRender(topaz);
		
	}
	
	public static void registerRender(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
