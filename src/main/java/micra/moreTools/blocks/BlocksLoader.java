package micra.moreTools.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public class BlocksLoader {

    public static BlockWerniumOre blockWerniumOre = new BlockWerniumOre();
    public static BlockChromiumOre blockChromiumOre = new BlockChromiumOre();
    public static BlockChromiumBlock blockChromiumBlock = new BlockChromiumBlock();
    public static BlockNarregaBlock blockNarregaBlock = new BlockNarregaBlock();
    public static BlockStarRock blockStarRock = new BlockStarRock();
    public static BlockStainlessSteelBlock blockStainlessSteelBlock = new BlockStainlessSteelBlock();

    public BlocksLoader(){
        register(blockWerniumOre, "Wernium_Ore");
        register(blockChromiumOre, "Chrmium_Ore");
        register(blockChromiumBlock, "Chromium_Block");
        register(blockNarregaBlock, "Narrega_Block");
        register(blockStarRock, "Star_Rock");
        register(blockStainlessSteelBlock, "Stainless_Steel_Block");
    }

    private void register(Block block, String name){
        GameRegistry.registerBlock(block, name);
    }

    @SideOnly(Side.CLIENT)
    public static void LoadTextures(Block block, String textureName){
        block.setBlockTextureName(textureName);
    }
}
