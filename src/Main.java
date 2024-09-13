
public class Main {
    public static void main(String[] args) {
        var applePieWriter = new RecipeWriter("Appeltaart", ApplePieRecipe.getIngredients(), ApplePieRecipe.getInstructions());
        applePieWriter.WriteRecipe();
    }
}