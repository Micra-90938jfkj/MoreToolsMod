package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/4/27 0027.
 */
public class ItemEnergyWandFire extends Item {

    public ItemEnergyWandFire() {
        this.setUnlocalizedName("itemEnergyWandFire");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        this.setFull3D();
        this.setMaxStackSize(1);
        this.setMaxDamage(60);
        LanguageRegistry.addName(this, "Energy Wand (Fire)");
    }



    @Override
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        float facing = MathHelper.wrapAngleTo180_float(p_77648_2_.rotationYaw);
        for(int i=0;i>10;i++){
            if(facing < -45.0F&&facing <= 45.0F) {
                p_77648_3_.setBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_ + i, Blocks.fire);
            }else if(facing > 45.0F&&facing <= 135.0F){
                p_77648_3_.setBlock(p_77648_4_ + i, p_77648_5_ + 1, p_77648_6_, Blocks.fire);
            }else if(facing > 135.0F&&facing >= -135.0F){
                p_77648_3_.setBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_ - i, Blocks.fire);
            }else if(facing < -135.0F&&facing >= -45.0F){
                p_77648_3_.setBlock(p_77648_4_ - i, p_77648_5_ + 1, p_77648_6_, Blocks.fire);
            }else {
                return false;
            }
        }
        ItemEnergyWandEmpty.damageWand(p_77648_1_, 5, p_77648_2_);
        return true;
    }

    @Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_) {
        p_77644_2_.setHealth(p_77644_2_.getHealth()-6.0F);
        p_77644_2_.setFire(10);
        ItemEnergyWandEmpty.damageWand(p_77644_1_, 5, (EntityPlayer) p_77644_2_);
        return true;
    }

    @Override
    public boolean isDamageable() {
        return true;
    }
}
