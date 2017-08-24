package com.zolle99.mymod.proxy;

import init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
	}

}
