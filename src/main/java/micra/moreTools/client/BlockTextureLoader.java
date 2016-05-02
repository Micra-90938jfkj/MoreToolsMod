package micra.moreTools.client;

import micra.moreTools.blocks.BlocksLoader;
import net.minecraft.init.Blocks;

/**
 * Created by Administrator on 2016/3/22 0022.
 */
public class BlockTextureLoader {
    public BlockTextureLoader(){
        BlocksLoader.LoadTextures(BlocksLoader.blockWerniumOre, "moretools:wernium_ore");
        BlocksLoader.LoadTextures(BlocksLoader.blockChromiumOre, "moretools:chromium_ore");
        BlocksLoader.LoadTextures(BlocksLoader.blockChromiumBlock, "moretools:chromium_block");
        BlocksLoader.LoadTextures(BlocksLoader.blockNarregaBlock, "moretools:narrega_block");
        BlocksLoader.LoadTextures(BlocksLoader.blockStarRock, "moretools:star_rock");
        BlocksLoader.LoadTextures(BlocksLoader.blockStainlessSteelBlock, "moretools:stainless_steel_block");
    }
}
