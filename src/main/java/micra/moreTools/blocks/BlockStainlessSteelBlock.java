package micra.moreTools.blocks;

import cpw.mods.fml.common.registry.LanguageRegistry;
import micra.moreTools.creativeTabs.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Administrator on 2016/4/23.
 */
public class BlockStainlessSteelBlock extends Block {
    protected BlockStainlessSteelBlock() {
        super(Material.rock);
        this.setBlockName("blockStainlessSteel");
        this.setCreativeTab(CreativeTabsLoader.MainCreativeTab);
        this.setHardness(3.0F);
        LanguageRegistry.addName(this, "Stainless Steel Block");
    }
}
