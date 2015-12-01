package com.webs.crimstarstudios.tutorial;

import com.webs.crimstarstudios.tutorial.init.CSItems;
import com.webs.crimstarstudios.tutorial.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
public class TutorialMod {
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		CSItems.init();
		CSItems.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
		
		
	}
	
}
