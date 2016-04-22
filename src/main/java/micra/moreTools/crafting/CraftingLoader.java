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
        GameRegistry.addRecipe(new ItemStack(ItemsLoader.itemWerniumedDiamond),
                new Object[]{"WWW", "WDW", "WWW", 'W', ItemsLoader.itemWerniumIngot, 'D', Items.diamond});
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
    }

    private static void registerSmelting(){
        GameRegistry.addSmelting(BlocksLoader.blockWerniumOre, new ItemStack(ItemsLoader.itemWerniumIngot), 2F);
        GameRegistry.addSmelting(BlocksLoader.blockChromiumOre, new ItemStack(ItemsLoader.itemChromium), 0.3F);
    }
}
