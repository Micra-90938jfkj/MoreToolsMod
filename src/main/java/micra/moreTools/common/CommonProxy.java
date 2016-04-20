package micra.moreTools.common;

import micra.moreTools.blocks.BlocksLoader;
import micra.moreTools.crafting.CraftingLoader;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import micra.moreTools.items.ItemsLoader;
import micra.moreTools.worldgen.WorldGeneratorLoader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event){
        new CreativeTabsLoader();
        new BlocksLoader();
        new ItemsLoader();
    }

    public void init(FMLInitializationEvent event){
        new CraftingLoader();
        new WorldGeneratorLoader();
    }

    public void postInit(FMLPostInitializationEvent event){

    }
}
