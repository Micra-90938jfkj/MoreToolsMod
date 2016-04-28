package micra.moreTools.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/4/27 0027.
 */
public class ItemEnergyWandExplode extends ItemEnergyWand {
    public ItemEnergyWandExplode(){
        super();
        this.setUnlocalizedName("itemEnergyWandExplode");
        LanguageRegistry.addName(this, "Energy Wand (Explode)");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
        p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));
        return p_77659_1_;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_) {
        return 100;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.bow;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_) {
        EntityTNTPrimed tnt1 = new EntityTNTPrimed(p_77615_2_, p_77615_3_.posX, p_77615_3_.posY+p_77615_3_.getEyeHeight(), p_77615_3_.posZ, p_77615_3_);
        EntityTNTPrimed tnt2 = new EntityTNTPrimed(p_77615_2_, p_77615_3_.posX, p_77615_3_.posY+p_77615_3_.getEyeHeight(), p_77615_3_.posZ, p_77615_3_);
        EntityTNTPrimed tnt3 = new EntityTNTPrimed(p_77615_2_, p_77615_3_.posX, p_77615_3_.posY+p_77615_3_.getEyeHeight(), p_77615_3_.posZ, p_77615_3_);
        EntityTNTPrimed tnt4 = new EntityTNTPrimed(p_77615_2_, p_77615_3_.posX, p_77615_3_.posY+p_77615_3_.getEyeHeight(), p_77615_3_.posZ, p_77615_3_);
        int duration = this.getMaxItemUseDuration(p_77615_1_)-p_77615_4_;
        float speed = duration * duration * 0.785F / 100;
        tnt1.motionX = speed;
        tnt2.motionZ = speed;
        tnt3.motionX = -speed;
        tnt4.motionZ = -speed;
        tnt1.motionY = 1;
        tnt2.motionY = 1;
        tnt3.motionY = 1;
        tnt4.motionY = 1;
        p_77615_2_.spawnEntityInWorld(tnt1);
        p_77615_2_.spawnEntityInWorld(tnt2);
        p_77615_2_.spawnEntityInWorld(tnt3);
        p_77615_2_.spawnEntityInWorld(tnt4);
        this.damageWand(p_77615_1_, 5, p_77615_3_);
    }

    @Override
    public boolean hitEntity(ItemStack p_77644_1_, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_) {
        World world = p_77644_2_.worldObj;
        world.createExplosion(p_77644_3_, p_77644_2_.posX, p_77644_2_.posY+0.00001F, p_77644_2_.posZ, 0.785F, true);
        if(p_77644_3_ instanceof EntityPlayer){
            this.damageWand(p_77644_1_, 1, (EntityPlayer) p_77644_3_);
        }
        return true;
    }
}
