package micra.moreTools.items;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/3/24 0024.
 */
public class ItemWerniumIngot extends Item {
    public ItemWerniumIngot(){
        this.setUnlocalizedName("itemWerniumIngot");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        LanguageRegistry.addName(this, "Wernium Ingot");
    }
}
