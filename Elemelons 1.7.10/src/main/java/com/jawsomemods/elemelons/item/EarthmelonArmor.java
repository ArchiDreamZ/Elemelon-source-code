package com.jawsomemods.elemelons.item;

import com.jawsomemods.elemelons.ElemelonMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EarthmelonArmor extends ItemArmor {

	public EarthmelonArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "em:textures/models/armor/earthmelon_layer_2.png";
		}
		return "em:textures/models/armor/earthmelon_layer_1.png";
	}
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if(player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null)
		{
			ItemStack helmet = player.getCurrentArmor(3);
			ItemStack chestplate = player.getCurrentArmor(2);
			ItemStack leggings = player.getCurrentArmor(1);
			ItemStack boots = player.getCurrentArmor(0);
			
			if(helmet.getItem() == ElemelonMod.earthmelonHelmet && chestplate.getItem() == ElemelonMod.earthmelonChestplate && leggings.getItem() == ElemelonMod.earthmelonLeggings && boots.getItem() == ElemelonMod.earthmelonBoots)
			{
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 100, 0));
			}
		}
	}
}