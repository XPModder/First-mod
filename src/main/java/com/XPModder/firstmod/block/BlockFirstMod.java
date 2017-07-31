package com.XPModder.firstmod.block;

import com.XPModder.firstmod.creativetab.CreativeTabFirstMod;
import com.XPModder.firstmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockFirstMod extends Block{

    public BlockFirstMod(Material material){

        super(material);
        this.setCreativeTab(CreativeTabFirstMod.FM_TAB);

    }

    public BlockFirstMod(){

        super(Material.rock);
        this.setCreativeTab(CreativeTabFirstMod.FM_TAB);

    }


    @Override
    public String getUnlocalizedName(){

        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){

        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));

    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

}
