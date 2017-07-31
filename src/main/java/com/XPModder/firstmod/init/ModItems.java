package com.XPModder.firstmod.init;

import com.XPModder.firstmod.item.ItemFirstItem;
import com.XPModder.firstmod.item.itemFirstMod;
import com.XPModder.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final itemFirstMod firstItem = new ItemFirstItem();

    public static void init(){

        GameRegistry.registerItem(firstItem, "firstItem");

    }

}
