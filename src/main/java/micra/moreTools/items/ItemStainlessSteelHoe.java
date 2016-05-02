package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.ItemHoe;

/**
 * Created by Administrator on 2016/4/22.
 */
public class ItemStainlessSteelHoe extends ItemHoe {
    public ItemStainlessSteelHoe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemStainlessSteelHoe");
        this.setCreativeTab(CreativeTabsLoader.techTab);
    }
}
