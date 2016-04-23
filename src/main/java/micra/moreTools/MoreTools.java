package micra.moreTools;

import micra.moreTools.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
@Mod(modid = MoreTools.MODID, name = MoreTools.NAME, version = MoreTools.VERSION)
public class MoreTools {
    public static final String MODID = "MoreTools";
    public static final String NAME = "More Tools";
    public static final String VERSION = "beta2";

    @SidedProxy(clientSide = "micra.moreTools.client.ClientProxy",
            serverSide = "micra.moreTools.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
