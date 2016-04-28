package micra.moreTools.blocks;

import micra.moreTools.creativeTabs.CreativeTabsLoader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockOre;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public class BlockWerniumOre extends BlockOre {
    protected BlockWerniumOre() {
        super();
        this.setHardness(1.0F);
        this.setBlockName("blockWerniumOre");
        this.setCreativeTab(CreativeTabsLoader.magicTab);
        this.setHardness(4.0F);
        this.setLightLevel(0.5F);
        LanguageRegistry.addName(this, "Wernium Ore");
    }
}
