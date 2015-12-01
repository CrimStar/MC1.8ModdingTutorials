package com.webs.crimstarstudios.tutorial.proxy;

import com.webs.crimstarstudios.tutorial.init.CSItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		
		CSItems.registerRenders();
		
	}
	
}
