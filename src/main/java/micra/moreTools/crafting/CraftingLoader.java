package micra.moreTools.crafting;

import micra.moreTools.blocks.BlocksLoader;
import micra.moreTools.items.ItemsLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Administrator on 2016/3/24 0024.
 */
public class CraftingLoader {
    public CraftingLoader(){
        registerRecipe();
        registerSmelting();
    }

    private static void registerRecipe(){
        GameRegistry.addShapelessRecipe(new ItemStack(ItemsLoader.itemNarregaIngot),
                new Object[]{Items.glowstone_dust, ItemsLoader.itemWernium, Items.blaze_powder, Items.gold_ingot, Items.quartz});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamond),
                new Object[]{"BNB", "NDN", "BNB", 'B', Items.blaze_powder, 'N', ItemsLoader.itemNarregaIngot, 'D', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamondSword),
                new Object[]{"DWD", "DWD", " S ", 'D', Items.diamond, 'W', ItemsLoader.itemWerniumedDiamond, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamondPickaxe),
                new Object[]{"WWW", " S ", " S ", 'W', ItemsLoader.itemWerniumedDiamond, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamondAxe),
                new Object[]{"WW ", "WS ", " S ", 'W', ItemsLoader.itemWerniumedDiamond, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamondHoe),
                new Object[]{"WW ", " S ", " S ", 'W', ItemsLoader.itemWerniumedDiamond, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamondShovel),
                new Object[]{" W ", " S ", " S ", 'W', ItemsLoader.itemWerniumedDiamond, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamondWand),
                new Object[]{"WWW", "WWW", " S ", 'W', ItemsLoader.itemWerniumedDiamond, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemStainlessSteelIngot, 3),
                new Object[]{"CCC", "III", "CCC", 'C', ItemsLoader.itemChromium, 'I', Items.iron_ingot});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemStainlessSteelAxe),
                new Object[]{"SS ", "ST ", " T ", 'S', ItemsLoader.itemStainlessSteelIngot, 'T', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemStainlessSteelHoe),
                new Object[]{"SS ", " T ", " T ", 'S', ItemsLoader.itemStainlessSteelIngot, 'T', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemStainlessSteelPickaxe),
                new Object[]{"SSS", " T ", " T ", 'S', ItemsLoader.itemStainlessSteelIngot, 'T', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemStainlessSteelShovel),
                new Object[]{" S ", " T ", " T ", 'S', ItemsLoader.itemStainlessSteelIngot, 'T', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemStainlessSteelSword),
                new Object[]{" S ", " S ", " T ", 'S', ItemsLoader.itemStainlessSteelIngot, 'T', Items.stick});
        GameRegistry.addRecipe(new ItemStack(BlocksLoader.blockStainlessSteelBlock),
                new Object[]{"SSS", "SSS", "SSS", 'S', ItemsLoader.itemStainlessSteelIngot});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemsLoader.itemStainlessSteelIngot, 9),
                new Object[]{BlocksLoader.blockStainlessSteelBlock});
        GameRegistry.addRecipe(new ItemStack(BlocksLoader.blockChromiumBlock),
                new Object[]{"CCC", "CCC", "CCC", 'C', ItemsLoader.itemChromium});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemsLoader.itemChromium, 9),
                new Object[]{BlocksLoader.blockChromiumBlock});
    }

    private static void registerSmelting(){
        GameRegistry.addSmelting(BlocksLoader.blockWerniumOre, new ItemStack(ItemsLoader.itemWernium), 0.3F);
        GameRegistry.addSmelting(BlocksLoader.blockChromiumOre, new ItemStack(ItemsLoader.itemChromium), 0.3F);
    }
}
