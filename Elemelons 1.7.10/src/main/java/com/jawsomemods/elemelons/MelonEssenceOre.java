package com.jawsomemods.elemelons;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class MelonEssenceOre extends Block {

	protected MelonEssenceOre(Material material) {
		super(material);
		this.setHardness(3.0F);
		this.setResistance(3.0F);
		this.setHarvestLevel("pickaxe", 1);
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return ElemelonMod.melonEssence;
	}
}
