package fr.zom.aquaticarmors.init;

import fr.zom.aquaticarmors.items.ItemAquaticArmors;
import fr.zom.aquaticarmors.items.ItemArmorAquaticArmors;
import fr.zom.aquaticarmors.utils.ArmorMaterials;
import fr.zom.aquaticarmors.utils.References;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ModItems
{

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, References.MODID);

	public static final RegistryObject<Item> shiny_prismarine = ITEMS.register("shiny_prismarine", ItemAquaticArmors::new);
	public static final RegistryObject<Item> blue_prismarine = ITEMS.register("blue_prismarine", ItemAquaticArmors::new);
	public static final RegistryObject<Item> green_prismarine = ITEMS.register("green_prismarine", ItemAquaticArmors::new);
	public static final RegistryObject<Item> red_prismarine = ITEMS.register("red_prismarine", ItemAquaticArmors::new);
	public static final RegistryObject<Item> very_shiny_prismarine = ITEMS.register("very_shiny_prismarine", ItemAquaticArmors::new);

	public static final RegistryObject<Item> blue_armor_helmet = ITEMS.register("blue_armor_helmet", () -> new ItemArmorAquaticArmors(ArmorMaterials.BLUE_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> blue_armor_chestplate = ITEMS.register("blue_armor_chestplate", () -> new ItemArmorAquaticArmors(ArmorMaterials.BLUE_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> blue_armor_leggings = ITEMS.register("blue_armor_leggings", () -> new ItemArmorAquaticArmors(ArmorMaterials.BLUE_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> blue_armor_boots = ITEMS.register("blue_armor_boots", () -> new ItemArmorAquaticArmors(ArmorMaterials.BLUE_ARMOR, EquipmentSlotType.FEET));

	public static final RegistryObject<Item> green_armor_helmet = ITEMS.register("green_armor_helmet", () -> new ItemArmorAquaticArmors(ArmorMaterials.GREEN_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> green_armor_chestplate = ITEMS.register("green_armor_chestplate", () -> new ItemArmorAquaticArmors(ArmorMaterials.GREEN_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> green_armor_leggings = ITEMS.register("green_armor_leggings", () -> new ItemArmorAquaticArmors(ArmorMaterials.GREEN_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> green_armor_boots = ITEMS.register("green_armor_boots", () -> new ItemArmorAquaticArmors(ArmorMaterials.GREEN_ARMOR, EquipmentSlotType.FEET));

	public static final RegistryObject<Item> red_armor_helmet = ITEMS.register("red_armor_helmet", () -> new ItemArmorAquaticArmors(ArmorMaterials.RED_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> red_armor_chestplate = ITEMS.register("red_armor_chestplate", () -> new ItemArmorAquaticArmors(ArmorMaterials.RED_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> red_armor_leggings = ITEMS.register("red_armor_leggings", () -> new ItemArmorAquaticArmors(ArmorMaterials.RED_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> red_armor_boots = ITEMS.register("red_armor_boots", () -> new ItemArmorAquaticArmors(ArmorMaterials.RED_ARMOR, EquipmentSlotType.FEET));

	public static final RegistryObject<Item> very_shiny_armor_helmet = ITEMS.register("very_shiny_armor_helmet", () -> new ItemArmorAquaticArmors(ArmorMaterials.VERY_SHINY_ARMOR, EquipmentSlotType.HEAD));
	public static final RegistryObject<Item> very_shiny_armor_chestplate = ITEMS.register("very_shiny_armor_chestplate", () -> new ItemArmorAquaticArmors(ArmorMaterials.VERY_SHINY_ARMOR, EquipmentSlotType.CHEST));
	public static final RegistryObject<Item> very_shiny_armor_leggings = ITEMS.register("very_shiny_armor_leggings", () -> new ItemArmorAquaticArmors(ArmorMaterials.VERY_SHINY_ARMOR, EquipmentSlotType.LEGS));
	public static final RegistryObject<Item> very_shiny_armor_boots = ITEMS.register("very_shiny_armor_boots", () -> new ItemArmorAquaticArmors(ArmorMaterials.VERY_SHINY_ARMOR, EquipmentSlotType.FEET));

}
