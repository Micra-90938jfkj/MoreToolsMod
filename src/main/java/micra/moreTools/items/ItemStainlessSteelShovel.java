package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.ItemSpade;

/**
 * Created by Administrator on 2016/4/22.
 */
public class ItemStainlessSteelShovel extends ItemSpade {
    public ItemStainlessSteelShovel(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemStainlessSteelShovel");
        this.setCreativeTab(CreativeTabsLoader.techTab);
        LanguageRegistry.addName(this, "Stainless Steel Shovel");
    }
}
