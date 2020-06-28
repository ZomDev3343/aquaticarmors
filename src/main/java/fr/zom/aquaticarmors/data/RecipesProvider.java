package fr.zom.aquaticarmors.data;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;

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
