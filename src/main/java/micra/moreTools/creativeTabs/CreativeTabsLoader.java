package micra.moreTools.creativeTabs;

import micra.moreTools.items.ItemsLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public class CreativeTabsLoader {

    public static CreativeTabs MainCreativeTab = new CreativeTabs("MoreTools") {
        @Override
        public Item getTabIconItem() {
            int r = new Random().nextInt(3);
            Item item = ItemsLoader.itemWernium;
            if (r==0){
                item = ItemsLoader.itemWerniumedDiamondSword;
            }else if(r==1){
                item = ItemsLoader.itemWerniumedDiamond;
            }else if(r==2){
                item = ItemsLoader.itemWernium;
            }
            return item;
        }
    };

    public CreativeTabsLoader(){

    }
}
