package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.ItemSword;

/**
 * Created by Administrator on 2016/4/22.
 */
public class ItemStainlessSteelSword extends ItemSword {
    public ItemStainlessSteelSword(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemStainlessSteelSword");
        this.setCreativeTab(CreativeTabsLoader.techTab);
    }
}
