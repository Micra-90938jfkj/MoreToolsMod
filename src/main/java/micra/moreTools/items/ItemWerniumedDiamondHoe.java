package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.ItemHoe;

/**
 * Created by Administrator on 2016/4/20 0020.
 */
public class ItemWerniumedDiamondHoe extends ItemHoe {
    public ItemWerniumedDiamondHoe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemWerniumedDiamondHoe");
        this.setCreativeTab(CreativeTabsLoader.magicTab);
        LanguageRegistry.addName(this, "Werniumed Diamond Hoe");
    }
}
