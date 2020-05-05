package fr.zom.aquaticarmors.items;

import fr.zom.aquaticarmors.AquaticArmors;
import fr.zom.aquaticarmors.init.ModItems;
import fr.zom.aquaticarmors.utils.References;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Objects;

public class ItemArmorAquaticArmors extends ArmorItem
{

	public ItemArmorAquaticArmors(IArmorMaterial material, EquipmentSlotType slot)
	{
		super(material, slot, new Item.Properties().group(AquaticArmors.aa_tab));
	}

	@Nullable
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
	{
		if( slot == EquipmentSlotType.HEAD || slot == EquipmentSlotType.CHEST || slot == EquipmentSlotType.FEET )
		{
			return References.MODID + ":textures/models/armor/" + material.getName() + "_layer_1.png";
		}
		else
		{
			return References.MODID + ":textures/models/armor/" + material.getName() + "_layer_2.png";
		}
	}

	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
	{
		ItemStack helmet = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
		ItemStack chestplate = player.getItemStackFromSlot(EquipmentSlotType.CHEST);
		ItemStack leggings = player.getItemStackFromSlot(EquipmentSlotType.LEGS);
		ItemStack boots = player.getItemStackFromSlot(EquipmentSlotType.FEET);

		if( helmet.getItem() == ModItems.blue_armor_helmet.get() && chestplate.getItem() == ModItems.blue_armor_chestplate.get() && leggings.getItem() == ModItems.blue_armor_leggings.get() && boots.getItem() == ModItems.blue_armor_boots.get() )
		{
			player.addPotionEffect(new EffectInstance(Objects.requireNonNull(Effect.get(13)), 200));
		}

		if( helmet.getItem() == ModItems.green_armor_helmet.get() && chestplate.getItem() == ModItems.green_armor_chestplate.get() && leggings.getItem() == ModItems.green_armor_leggings.get() && boots.getItem() == ModItems.green_armor_boots.get() )
		{
			player.addPotionEffect(new EffectInstance(Objects.requireNonNull(Effect.get(13)), 200));
		}

		if( helmet.getItem() == ModItems.red_armor_helmet.get() && chestplate.getItem() == ModItems.red_armor_chestplate.get() && leggings.getItem() == ModItems.red_armor_leggings.get() && boots.getItem() == ModItems.red_armor_boots.get() )
		{
			player.addPotionEffect(new EffectInstance(Objects.requireNonNull(Effect.get(13)), 200));
		}

		if( helmet.getItem() == ModItems.very_shiny_armor_helmet.get() && chestplate.getItem() == ModItems.very_shiny_armor_chestplate.get() && leggings.getItem() == ModItems.very_shiny_armor_leggings.get() && boots.getItem() == ModItems.very_shiny_armor_boots.get() )
		{
			if( player.getActivePotionEffect(Objects.requireNonNull(Effect.get(16))) == null )
			{
				player.addPotionEffect(new EffectInstance(Objects.requireNonNull(Effect.get(16)), 400));
			}
			player.addPotionEffect(new EffectInstance(Objects.requireNonNull(Effect.get(13)), 200));
		}
	}
}
