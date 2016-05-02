package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.ItemSpade;

/**
 * Created by Administrator on 2016/3/31 0031.
 */
public class ItemWerniumedDiamondShovel extends ItemSpade {

    public ItemWerniumedDiamondShovel(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemWerniumedDiamondShovel");
        this.setCreativeTab(CreativeTabsLoader.magicTab);
    }

}
