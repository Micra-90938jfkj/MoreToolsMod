package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/4/23.
 */
public class ItemNarregaIngot extends Item {
    public ItemNarregaIngot(){
        super();
        this.setUnlocalizedName("itemNarregaIngot");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        LanguageRegistry.addName(this, "Narrega Ingot");
    }
}
