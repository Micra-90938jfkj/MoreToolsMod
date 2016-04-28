package micra.moreTools.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Administrator on 2016/4/25 0025.
 */
public class BlockNarregaBlock extends Block {
    protected BlockNarregaBlock() {
        super(Material.rock);
        this.setBlockName("blockNarregaBlock");
        this.setLightLevel(4.0F);
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        this.setHardness(5.0F);
        LanguageRegistry.addName(this, "Narrega Block");
    }
}
