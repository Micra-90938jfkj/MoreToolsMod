package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Administrator on 2016/3/31 0031.
 */
public class ItemEnergyWandEmpty extends Item {

    public ItemEnergyWandEmpty() {
        this.setUnlocalizedName("itemEnergyWandEmpty");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        this.setFull3D();
        this.setMaxStackSize(1);
        LanguageRegistry.addName(this, "Energy Wand (Empty)");
    }

    public static void damageWand(ItemStack stack, int damage, EntityPlayer player){
        if(!player.capabilities.isCreativeMode) {
            if (stack.getItemDamage() >= stack.getMaxDamage()) {
                stack.func_150996_a(ItemsLoader.itemEnergyWandEmpty);
            } else {
                stack.setItemDamage(stack.getItemDamage() + damage);
            }
        }
    }

}
