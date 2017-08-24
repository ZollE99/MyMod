package init;

import com.zolle99.mymod.Reference;

import items.ItemObsidianIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item obsidianIngot;
	public static Item thickStick;
	
	public static void preInit() {
		obsidianIngot = new ItemObsidianIngot();
		thickStick = new ItemObsidianIngot();
		register();
	}
	
	public static void register() {
		GameRegistry.register(obsidianIngot);
		GameRegistry.register(thickStick);
	}
	
	public static void registerRenders() {
		registerRender(obsidianIngot);
		registerRender(thickStick);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
