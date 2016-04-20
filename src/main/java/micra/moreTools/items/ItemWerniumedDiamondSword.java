package micra.moreTools.items;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.ItemSword;

/**
 * Created by Administrator on 2016/3/25 0025.
 */
public class ItemWerniumedDiamondSword extends ItemSword {

    public ItemWerniumedDiamondSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        this.setUnlocalizedName("itemWerniumedDiamondSword");
        LanguageRegistry.addName(this, "Werniumed Diamond Sword");
    }
}
