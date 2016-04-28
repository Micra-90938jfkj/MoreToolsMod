package micra.moreTools.items;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Administrator on 2016/4/28 0028.
 */
public class ItemEnergyWand extends Item {
    public ItemEnergyWand(){
        this.setFull3D();
        this.setCreativeTab(CreativeTabsLoader.magicTab);
        this.setMaxDamage(60);
        this.setMaxStackSize(1);
    }

    @Override
    public boolean isDamageable() {
        return true;
    }

    public void damageWand(ItemStack stack, int damage, EntityPlayer player){
        if(!player.capabilities.isCreativeMode) {
            if (stack.getItemDamage() >= stack.getMaxDamage()) {
                stack.func_150996_a(ItemsLoader.itemEnergyWandEmpty);
                stack.setItemDamage(0);
            } else {
                stack.setItemDamage(stack.getItemDamage() + damage);
            }
        }
    }
}
