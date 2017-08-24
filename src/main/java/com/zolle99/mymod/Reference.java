package com.zolle99.mymod;

public class Reference {
	
	public static final String MOD_ID = "zolle99mymod";
	public static final String NAME = "My Mod";
	public static final String VERSION = "0.1dev";
	public static final String ACCEPTED_VERSIONS = "{1.10.2}";
	
	public static final String CLIENT_PROXY_CLASS = "com.zolle99.mymod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.zolle99.mymod.proxy.ServerProxy";
	
	public static enum MyModItems {
		OBSIDIANINGOT("obsidianIngot", "ItemObsidianIngot"),
		THICKSTICK("thickStick", "ItemThickStick");
		
		
		private String unlocalizedName;
		private String registryName;
		
		MyModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
