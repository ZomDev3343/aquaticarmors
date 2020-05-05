package fr.zom.aquaticarmors.utils;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nullable;

public enum ArmorMaterials implements IArmorMaterial
{

	BLUE_ARMOR("blue_armor", 875, new int[]{3, 7, 6, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, null, 0f),
	GREEN_ARMOR("green_armor", 950, new int[]{4, 7, 6, 3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, null, 0f),
	RED_ARMOR("red_armor", 1100, new int[]{4, 7, 6, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, null, 0.15f),
	VERY_SHINY_ARMOR("very_shiny_armor", 1350, new int[]{5, 8, 7, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, null, 0.5f);

	private final String name;
	private final int durability;
	private final int[] damageReductions;
	private final int enchantability;
	private final SoundEvent sound;
	private final Ingredient repairMaterial;
	private final float toughness;

	ArmorMaterials(String name, int durability, int[] damageReductions, int enchantability, SoundEvent sound, @Nullable Ingredient repairMaterial, float toughness)
	{
		this.name = name;
		this.durability = durability;
		this.damageReductions = damageReductions;
		this.enchantability = enchantability;
		this.sound = sound;
		this.repairMaterial = repairMaterial;
		this.toughness = toughness;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn)
	{
		return durability;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn)
	{
		return damageReductions[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability()
	{
		return enchantability;
	}

	@Override
	public SoundEvent getSoundEvent()
	{
		return sound;
	}

	@Override
	public Ingredient getRepairMaterial()
	{
		if( repairMaterial == null )
		{
			return Ingredient.EMPTY;
		}
		return repairMaterial;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public float getToughness()
	{
		return toughness;
	}
}
