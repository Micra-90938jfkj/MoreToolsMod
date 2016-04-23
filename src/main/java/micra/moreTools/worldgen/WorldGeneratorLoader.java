package micra.moreTools.worldgen;

import micra.moreTools.blocks.BlocksLoader;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

/**
 * Created by Administrator on 2016/3/24 0024.
 */
public class WorldGeneratorLoader {

    public static IWorldGenerator werniumOreGenerator;
    public static IWorldGenerator chromiumOreGenerator;

    public WorldGeneratorLoader(){
        werniumOreGenerator = new IWorldGenerator() {

            WorldGenMinable GeneratorCore = new WorldGenMinable(BlocksLoader.blockWerniumOre, 3);

            @Override
            public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
                if(world.provider.dimensionId == 0){
                    for(int i=1;i<random.nextInt(25);i++){
                        int posX = chunkX * 16 + random.nextInt(16);
                        int posY = random.nextInt(10)+10;
                        int posZ = chunkZ * 16 + random.nextInt(16);
                        if(random.nextBoolean()){
                            GeneratorCore.generate(world, random, posX, posY, posZ);
                        }
                    }
                }
            }
        };
        chromiumOreGenerator = new IWorldGenerator() {

            WorldGenMinable GeneratorCore = new WorldGenMinable(BlocksLoader.blockChromiumOre, 5);

            @Override
            public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
                if(world.provider.dimensionId == 0){
                    for(int i=1;i<60;i++){
                        int posX = chunkX * 16 + random.nextInt(16);
                        int posY = random.nextInt(28)+12;
                        int posZ = chunkZ * 16 + random.nextInt(16);
                        GeneratorCore.generate(world, random, posX, posY, posZ);
                    }
                }
            }
        };
        GameRegistry.registerWorldGenerator(werniumOreGenerator, 0);
        GameRegistry.registerWorldGenerator(chromiumOreGenerator, 10);
    }
}
