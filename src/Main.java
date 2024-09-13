
public class Main {
    public static void main(String[] args) {
        var applePieWriter = new RecipeWriter(ApplePieRecipe.getTitle(), ApplePieRecipe.getIngredients(), ApplePieRecipe.getInstructions());
        applePieWriter.WriteRecipe();
    }
}