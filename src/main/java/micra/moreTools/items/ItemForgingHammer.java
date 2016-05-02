package micra.moreTools.items;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Administrator on 2016/5/1.
 */
public class ItemForgingHammer extends Item {

    public final ToolMaterial material;

    public ItemForgingHammer(ToolMaterial material){
        this.material = material;
        this.setCreativeTab(CreativeTabsLoader.techTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(70);
        this.setFull3D();
    }

    @Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_) {
        if(p_77644_2_ instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) p_77644_2_;
            player.setHealth(player.getHealth() - material.getDamageVsEntity());
        }
        return true;
    }
}
