
public class Main {
    public static void main(String[] args) {
        var applePieWriter = new RecipeWriter("Apple Pie", ApplePieRecipe.getIngredients(), ApplePieRecipe.getInstructions());
        applePieWriter.WriteRecipe();
    }
}