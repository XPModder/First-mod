package com.XPModder.firstmod.creativetab;

import com.XPModder.firstmod.init.ModItems;
import com.XPModder.firstmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabFirstMod {

    public static final CreativeTabs FM_TAB = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {

            return ModItems.firstItem;

        }

        @Override
        public String getTranslatedTabLabel(){

            return "First Mod";

        }

    };

}
