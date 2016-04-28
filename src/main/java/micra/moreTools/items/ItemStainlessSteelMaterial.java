package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.Item;

/**
 * Created by Administrator on 2016/4/26 0026.
 */
public class ItemStainlessSteelMaterial extends Item {

    protected ItemStainlessSteelMaterial(){
        this.setUnlocalizedName("itemStainlessSteelMaterial");
        this.setCreativeTab(CreativeTabsLoader.techTab);
        LanguageRegistry.addName(this, "Stainless Steel Material");
    }

}
