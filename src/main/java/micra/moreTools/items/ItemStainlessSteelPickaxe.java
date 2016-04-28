package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by Administrator on 2016/4/22.
 */
public class ItemStainlessSteelPickaxe extends ItemPickaxe {
    protected ItemStainlessSteelPickaxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("itemStainlessSteelPickaxe");
        this.setCreativeTab(CreativeTabsLoader.techTab);
        LanguageRegistry.addName(this, "Stainless Steel Pickaxe");
    }
}
