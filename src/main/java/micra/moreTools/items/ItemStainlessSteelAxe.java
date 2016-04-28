package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.ItemAxe;

/**
 * Created by Administrator on 2016/4/22.
 */
public class ItemStainlessSteelAxe extends ItemAxe {
    protected ItemStainlessSteelAxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemStainlessSteelAxe");
        this.setCreativeTab(CreativeTabsLoader.techTab);
        LanguageRegistry.addName(this, "Stainless Steel Axe");
    }
}
