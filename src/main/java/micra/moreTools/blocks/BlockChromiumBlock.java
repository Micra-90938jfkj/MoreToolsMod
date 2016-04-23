package micra.moreTools.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Administrator on 2016/4/23.
 */
public class BlockChromiumBlock extends Block {
    protected BlockChromiumBlock() {
        super(Material.rock);
        this.setBlockName("blockChromiumBlock");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        this.setHardness(2.5F);
        LanguageRegistry.addName(this, "ChromiumBlock");
    }
}
