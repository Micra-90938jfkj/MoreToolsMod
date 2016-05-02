package micra.moreTools.blocks;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import micra.moreTools.items.ItemsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Administrator on 2016/4/30.
 */
public class BlockStarRock extends Block {
    protected BlockStarRock() {
        super(Material.rock);
        this.setBlockName("blockStarRock");
        this.setHardness(4.0F);
        this.setCreativeTab(CreativeTabsLoader.magicTab);
        this.setLightLevel(4.0F);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return ItemsLoader.itemStarRockFragment;
    }
}
