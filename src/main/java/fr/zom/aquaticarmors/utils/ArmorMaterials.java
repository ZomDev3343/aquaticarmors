package fr.zom.aquaticarmors.utils;

import fr.zom.aquaticarmors.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import javax.annotation.Nullable;

public enum ArmorMaterials implements IArmorMaterial
{

	BLUE_ARMOR("blue_armor", 875, new int[]{2, 4, 3, 2}, 6, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(ModItems.blue_prismarine.get()), 0f),
	GREEN_ARMOR("green_armor", 950, new int[]{3, 5, 4, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(ModItems.green_prismarine.get()), 0f),
	RED_ARMOR("red_armor", 1100, new int[]{3, 6, 5, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(ModItems.red_prismarine.get()), 0.15f),
	VERY_SHINY_ARMOR("very_shiny_armor", 1350, new int[]{4, 7, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(ModItems.very_shiny_prismarine.get()), 0.25f);

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
