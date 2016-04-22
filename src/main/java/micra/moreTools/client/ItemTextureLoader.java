package micra.moreTools.client;

import micra.moreTools.items.ItemsLoader;

/**
 * Created by Administrator on 2016/3/24 0024.
 */
public class ItemTextureLoader {
    public ItemTextureLoader(){
        loadAll();
    }

    private static void loadAll(){
        ItemsLoader.loadTextures(ItemsLoader.itemChromium, "moretools:chromium");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelIngot, "moretools:stainless_steel_ingot");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumIngot, "moretools:wernium_ingot");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamond, "moretools:werniumed_diamond");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondSword, "moretools:werniumed_diamond_sword");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondPickaxe, "moretools:werniumed_diamond_pickaxe");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondAxe, "moretools:werniumed_diamond_axe");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondHoe, "moretools:werniumed_diamond_hoe");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondShovel, "moretools:werniumed_diamond_shovel");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondWand, "moretools:werniumed_diamond_wand");
    }
}
