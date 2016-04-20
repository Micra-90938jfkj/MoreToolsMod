package micra.moreTools.items;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Administrator on 2016/3/30 0030.
 */
public class ItemWerniumedDiamondPickaxe extends ItemPickaxe {

    public ItemWerniumedDiamondPickaxe(ToolMaterial material){

        super(material);
        this.setUnlocalizedName("itemWerniumedDiamondPickaxe");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        LanguageRegistry.addName(this, "Werniumed Diamond Pickaxe");
    }

}
