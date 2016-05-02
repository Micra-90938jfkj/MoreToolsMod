package micra.moreTools.common.events;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by Administrator on 2016/5/1.
 */
public class EventsLoader {
    public EventsLoader(){
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerCrafted(PlayerEvent.ItemCraftedEvent event){

    }
}
