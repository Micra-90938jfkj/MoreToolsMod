package micra.moreTools.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Administrator on 2016/3/24 0024.
 */
public class ItemsLoader {

    public static Item.ToolMaterial WERNIUMEDDIAMOND = EnumHelper.addToolMaterial("WERNIUMEDDIAMOND", 4, 6000, 10.5F, 17.5F, 20);

    public static ItemWerniumIngot itemWerniumIngot = new ItemWerniumIngot();
    public static ItemWerniumedDiamond itemWerniumedDiamond = new ItemWerniumedDiamond();
    public static ItemWerniumedDiamondSword itemWerniumedDiamondSword = new ItemWerniumedDiamondSword(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondPickaxe itemWerniumedDiamondPickaxe = new ItemWerniumedDiamondPickaxe(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondAxe itemWerniumedDiamondAxe = new ItemWerniumedDiamondAxe(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondHoe itemWerniumedDiamondHoe = new ItemWerniumedDiamondHoe(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondShovel itemWerniumedDiamondShovel = new ItemWerniumedDiamondShovel(WERNIUMEDDIAMOND);
    public static ItemWerniumedDiamondWand itemWerniumedDiamondWand = new ItemWerniumedDiamondWand();

    public ItemsLoader(){
        registerAll();
    }

    private static void register(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    private static void registerAll(){
        register(itemWerniumIngot, "Werniumed_Ingot");
        register(itemWerniumedDiamond, "Werniumed_Diamond");
        register(itemWerniumedDiamondSword, "Werniumed_Diamond_Sword");
        register(itemWerniumedDiamondPickaxe, "Werniumed_Diamond_Pickaxe");
        register(itemWerniumedDiamondAxe, "Werniumed_Diamond_Axe");
        register(itemWerniumedDiamondHoe, "Werniumed_Diamond_Hoe");
        register(itemWerniumedDiamondShovel, "Werniumed_Diamond_Shovel");
        register(itemWerniumedDiamondWand, "Werniumed_Diamond_Wand");
    }

    @SideOnly(Side.CLIENT)
    public static void loadTextures(Item item, String textureName){
        item.setTextureName(textureName);
    }
}
