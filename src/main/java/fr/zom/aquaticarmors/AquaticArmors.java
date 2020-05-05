package fr.zom.aquaticarmors;

import fr.zom.aquaticarmors.init.ModItems;
import fr.zom.aquaticarmors.utils.References;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(References.MODID)
public class AquaticArmors
{

	public AquaticArmors()
	{
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.ITEMS.register(bus);

	}

	public static final ItemGroup aa_tab = new ItemGroup("aa_tab")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ModItems.very_shiny_prismarine.get());
		}
	};

	private void setup(final FMLCommonSetupEvent e)
	{

	}

	private void clientSetup(final FMLClientSetupEvent e)
	{

	}


}
