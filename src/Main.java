
public class Main {
    public static void main(String[] args) {
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        var applePieWriter = new RecipeWriter("Apple Pie", applePieRecipe.ingredients, applePieRecipe.instructions);

        applePieWriter.WriteRecipe();

    }
}