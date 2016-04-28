package micra.moreTools.creativeTabs;

import micra.moreTools.items.ItemsLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Administrator on 2016/3/21 0021.
 */
public class CreativeTabsLoader {

    public static CreativeTabs magicTab = new CreativeTabs("MoreToolsMagicTab") {
        @Override
        public Item getTabIconItem() {
            return ItemsLoader.itemWernium;
        }
    };

    public static CreativeTabs techTab = new CreativeTabs("MoreToolsTechTab") {
        @Override
        public Item getTabIconItem() {
            return ItemsLoader.itemChromium;
        }
    };
}
