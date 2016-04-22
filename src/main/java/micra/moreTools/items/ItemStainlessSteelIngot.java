package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/4/22 0022.
 */
public class ItemStainlessSteelIngot extends Item {
    public ItemStainlessSteelIngot(){
        this.setUnlocalizedName("itemStainlessSteelIngot");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        LanguageRegistry.addName(this, "Stainless Steel Ingot");
    }
}
