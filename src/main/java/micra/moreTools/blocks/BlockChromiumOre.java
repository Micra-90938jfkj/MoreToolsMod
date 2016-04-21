package micra.moreTools.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.block.BlockOre;

/**
 * Created by Administrator on 2016/4/21 0021.
 */
public class BlockChromiumOre extends BlockOre {
    public BlockChromiumOre(){
        super();
        this.setHardness(3.0F);
        this.setBlockName("blockChromiumOre");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        LanguageRegistry.addName(this, "Chromium Ore");
    }
}
