package micra.moreTools.items;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Administrator on 2016/3/31 0031.
 */
public class ItemEnergyWand extends Item {

    public ItemEnergyWand() {
        super();
        this.setUnlocalizedName("itemEnergyWand");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(50);
        LanguageRegistry.addName(this, "Energy Wand");
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
        int i = 0;
        while(true) {
            if (world.getBlock(x, y - i, z).equals(Blocks.bedrock)) {
                break;
            }
            if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
                playBreakBlockSound(x, y, z, i, world);
            }
            if (!(world.getBlock(x, y - i, z).getMaterial().equals(Material.lava)) && !(world.getBlock(x, y - i, z).getMaterial().equals(Material.water))) {
                player.inventory.addItemStackToInventory(new ItemStack(world.getBlock(x, y - i, z)));
                world.setBlockToAir(x, y - i, z);
            }
            stack.setItemDamage(stack.getItemDamage()+1);
            i++;
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void playBreakBlockSound(int x, int y, int z, int i, World world){
        Material BlockMaterl = world.getBlock(x, y-i, z).getMaterial();
        if(BlockMaterl.equals(Material.cloth)){
            world.playSound(x, y-i, z, "dig.cloth", 1.0F, 1.0F, false);
        }else if(BlockMaterl.equals(Material.grass)){
            world.playSound(x, y-i, z, "dig.grass", 1.0F, 1.0F, false);
        }else if(BlockMaterl.equals(Material.rock)){
            world.playSound(x, y-i, z, "dig.stone", 1.0F, 1.0F, false);
        }else if(BlockMaterl.equals(Material.ground)){
            world.playSound(x, y-i, z, "dig.gravel", 1.0F, 1.0F, false);
        }else if(BlockMaterl.equals(Material.sand)){
            world.playSound(x, y-i, z, "dig.sand", 1.0F, 1.0F, false);
        }else if(BlockMaterl.equals(Material.snow)){
            world.playSound(x, y-i, z, "dig.snow", 1.0F, 1.0F, false);
        }else if(BlockMaterl.equals(Material.wood)){
            world.playSound(x, y-i, z, "dig.wood", 1.0F, 1.0F, false);
        }
    }

    @Override
    public boolean isDamageable(){
        return true;
    }

}
