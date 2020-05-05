package fr.zom.aquaticarmors.data;

import fr.zom.aquaticarmors.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.function.Consumer;

public class RecipesProvider extends RecipeProvider
{
	public RecipesProvider(DataGenerator generatorIn)
	{
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer)
	{
		ShapedRecipeBuilder.shapedRecipe(ModItems.shiny_prismarine.get())
				.key('G', Blocks.GLOWSTONE)
				.key('Q', Blocks.QUARTZ_BLOCK)
				.key('P', Items.PRISMARINE_SHARD)
				.patternLine("GQ")
				.patternLine("QP")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(Items.PRISMARINE_SHARD)).build(consumer);

		ShapedRecipeBuilder.shapedRecipe(ModItems.blue_prismarine.get())
				.key('D', Items.BLUE_DYE)
				.key('P', ModItems.shiny_prismarine.get())
				.patternLine(" D ")
				.patternLine("DPD")
				.patternLine(" D ")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(ModItems.shiny_prismarine.get()))
				.build(consumer);

		ShapedRecipeBuilder.shapedRecipe(ModItems.green_prismarine.get())
				.key('D', Items.GREEN_DYE)
				.key('P', ModItems.blue_prismarine.get())
				.patternLine(" D ")
				.patternLine("DPD")
				.patternLine(" D ")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(ModItems.blue_prismarine.get()))
				.build(consumer);

		ShapedRecipeBuilder.shapedRecipe(ModItems.red_prismarine.get())
				.key('D', Items.RED_DYE)
				.key('P', ModItems.green_prismarine.get())
				.patternLine(" D ")
				.patternLine("DPD")
				.patternLine(" D ")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(ModItems.green_prismarine.get()))
				.build(consumer);

		ShapedRecipeBuilder.shapedRecipe(ModItems.very_shiny_prismarine.get())
				.key('G', Blocks.GLOWSTONE)
				.key('P', ModItems.red_prismarine.get())
				.key('Q', Blocks.QUARTZ_BLOCK)
				.patternLine("QGQ")
				.patternLine("GPG")
				.patternLine("QGQ")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(ModItems.red_prismarine.get()))
				.build(consumer);
	}

	private ShapedRecipeBuilder helmet(Item result, Item material)
	{
		return ShapedRecipeBuilder.shapedRecipe(result)
				.key('M', material)
				.patternLine("MMM")
				.patternLine("M M")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(material));
	}

	private ShapedRecipeBuilder chestplate(Item result, Item material)
	{
		return ShapedRecipeBuilder.shapedRecipe(result)
				.key('M', material)
				.patternLine("M M")
				.patternLine("MMM")
				.patternLine("MMM")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(material));
	}

	private ShapedRecipeBuilder leggings(Item result, Item material)
	{
		return ShapedRecipeBuilder.shapedRecipe(result)
				.key('M', material)
				.patternLine("MMM")
				.patternLine("M M")
				.patternLine("M M")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(material));
	}

	private ShapedRecipeBuilder boots(Item result, Item material)
	{
		return ShapedRecipeBuilder.shapedRecipe(result)
				.key('M', material)
				.patternLine("M M")
				.patternLine("M M")
				.addCriterion("obtention", InventoryChangeTrigger.Instance.forItems(material));
	}

}
