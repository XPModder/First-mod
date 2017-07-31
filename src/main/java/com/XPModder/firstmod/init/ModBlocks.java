package com.XPModder.firstmod.init;

import com.XPModder.firstmod.block.BlockFirstBlock;
import com.XPModder.firstmod.block.BlockFirstMod;
import com.XPModder.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockFirstMod firstBlock = new BlockFirstBlock();

    public static void init(){

        GameRegistry.registerBlock(firstBlock, "firstBlock");

    }

}
