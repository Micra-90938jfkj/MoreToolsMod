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
        ItemsLoader.loadTextures(ItemsLoader.itemEnergyIngot, "moretools:energy_ingot");
        ItemsLoader.loadTextures(ItemsLoader.itemEnergyWandEmpty, "moretools:energy_wand_empty");
        ItemsLoader.loadTextures(ItemsLoader.itemEnergyWandFire, "moretools:energy_wand_fire");
        ItemsLoader.loadTextures(ItemsLoader.itemEnergyWandExplode, "moretools:energy_wand_explode");
        ItemsLoader.loadTextures(ItemsLoader.itemNarregaIngot, "moretools:narrega_ingot");
        ItemsLoader.loadTextures(ItemsLoader.itemStarRockFragment, "moretools:star_rock_fragment");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelIngot, "moretools:stainless_steel_ingot");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelMaterial, "moretools:stainless_steel_ingot_material");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelAxe, "moretools:stainless_steel_axe");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelHoe, "moretools:stainless_steel_hoe");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelPickaxe, "moretools:stainless_steel_pickaxe");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelShovel, "moretools:stainless_steel_shovel");
        ItemsLoader.loadTextures(ItemsLoader.itemStainlessSteelSword, "moretools:stainless_steel_sword");
        ItemsLoader.loadTextures(ItemsLoader.itemWernium, "moretools:wernium");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamond, "moretools:werniumed_diamond");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondSword, "moretools:werniumed_diamond_sword");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondPickaxe, "moretools:werniumed_diamond_pickaxe");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondAxe, "moretools:werniumed_diamond_axe");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondHoe, "moretools:werniumed_diamond_hoe");
        ItemsLoader.loadTextures(ItemsLoader.itemWerniumedDiamondShovel, "moretools:werniumed_diamond_shovel");
    }
}
