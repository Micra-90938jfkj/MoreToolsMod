package micra.moreTools.items;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/3/24 0024.
 */
public class ItemWernium extends Item {
    public ItemWernium(){
        this.setUnlocalizedName("itemWernium");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        LanguageRegistry.addName(this, "Wernium Ingot");
    }
}
