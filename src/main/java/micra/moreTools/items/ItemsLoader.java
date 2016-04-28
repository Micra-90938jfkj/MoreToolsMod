package micra.moreTools.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Administrator on 2016/3/24 0024.
 */
public class ItemsLoader {

    public static Item.ToolMaterial WERNIUMEDDIAMOND = EnumHelper.addToolMaterial("WERNIUMEDDIAMOND", 4, 2000, 10.5F, 12F, 20);
    public static Item.ToolMaterial STAINLESSSTEEL = EnumHelper.addToolMaterial("STAINLESSSTEEL", 2, 500, 6.0F, 2.0F, 14);

    public static ItemChromium itemChromium = new ItemChromium();
    public static ItemEnergyIngot itemEnergyIngot = new ItemEnergyIngot();
    public static ItemEnergyWandEmpty itemEnergyWandEmpty = new ItemEnergyWandEmpty();
    public static ItemEnergyWandFire itemEnergyWandFire = new ItemEnergyWandFire();
    public static ItemNarregaIngot itemNarregaIngot = new ItemNarregaIngot();
    public static ItemStainlessSteelIngot itemStainlessSteelIngot = new ItemStainlessSteelIngot();
    public static ItemStainlessSteelMaterial itemStainlessSteelMaterial = new ItemStainlessSteelMaterial();
    public static ItemStainlessSteelAxe itemStainlessSteelAxe = new ItemStainlessSteelAxe(STAINLESSSTEEL);
    public static ItemStainlessSteelHoe itemStainlessSteelHoe = new ItemStainlessSteelHoe(STAINLESSSTEEL);
    public static ItemStainlessSteelPickaxe itemStainlessSteelPickaxe = new ItemStainlessSteelPickaxe(STAINLESSSTEEL);
    public static ItemStainlessSteelShovel itemStainlessSteelShovel = new ItemStainlessSteelShovel(STAINLESSSTEEL);
    public static ItemStainlessSteelSword itemStainlessSteelSword = new ItemStainlessSteelSword(STAINLESSSTEEL);
    public static ItemWernium itemWernium = new ItemWernium();
    public static ItemWerniumedDiamond itemWerniumedDiamond = new ItemWerniumedDiamond();
    public static ItemWerniumedDiamondSword itemWerniumedDiamondSword = new ItemWerniumedDiamondSword(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondPickaxe itemWerniumedDiamondPickaxe = new ItemWerniumedDiamondPickaxe(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondAxe itemWerniumedDiamondAxe = new ItemWerniumedDiamondAxe(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondHoe itemWerniumedDiamondHoe = new ItemWerniumedDiamondHoe(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondShovel itemWerniumedDiamondShovel = new ItemWerniumedDiamondShovel(WERNIUMEDDIAMOND);

    public ItemsLoader(){
        WERNIUMEDDIAMOND.setRepairItem(new ItemStack(itemWerniumedDiamond));
        STAINLESSSTEEL.setRepairItem(new ItemStack(itemStainlessSteelIngot));
        registerAll();
    }

    private static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    private static void registerAll(){
        register(itemChromium, "Chromium");
        register(itemEnergyIngot, "Energy_Ingot");
        register(itemEnergyWandEmpty, "Energy_Wand_Empty");
        register(itemEnergyWandFire, "Energy_Wand_Fire");
        register(itemNarregaIngot, "Narrega_Ingot");
        register(itemStainlessSteelIngot, "Stainless_Steel_Ingot");
        register(itemStainlessSteelMaterial, "Stainless_Steel_Ingot_Material");
        register(itemStainlessSteelAxe, "Stainless_Steel_Axe");
        register(itemStainlessSteelHoe, "Stainless_Steel_Hoe");
        register(itemStainlessSteelPickaxe, "Stainless_Steel_Pickaxe");
        register(itemStainlessSteelShovel, "Stainless_Steel_Shovel");
        register(itemStainlessSteelSword, "Stainless_Steel_Sword");
        register(itemWernium, "Wernium");
        register(itemWerniumedDiamond, "Werniumed_Diamond");
        register(itemWerniumedDiamondSword, "Werniumed_Diamond_Sword");
        register(itemWerniumedDiamondPickaxe, "Werniumed_Diamond_Pickaxe");
        register(itemWerniumedDiamondAxe, "Werniumed_Diamond_Axe");
        register(itemWerniumedDiamondHoe, "Werniumed_Diamond_Hoe");
        register(itemWerniumedDiamondShovel, "Werniumed_Diamond_Shovel");
    }

    @SideOnly(Side.CLIENT)
    public static void loadTextures(Item item, String textureName){
        item.setTextureName(textureName);
    }
}
