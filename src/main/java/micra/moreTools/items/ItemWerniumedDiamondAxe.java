package micra.moreTools.items;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.ItemAxe;

/**
 * Created by Administrator on 2016/3/31 0031.
 */
public class ItemWerniumedDiamondAxe extends ItemAxe {

    public ItemWerniumedDiamondAxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemWerniumedDiamondAxe");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        LanguageRegistry.addName(this, "Werniumed Diamond Axe");
    }

}
