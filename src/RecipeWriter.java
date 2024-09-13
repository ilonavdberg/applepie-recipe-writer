import java.util.ArrayList;

public class RecipeWriter {
    private final String recipeName;
    private final ArrayList<Ingredient> ingredients;
    private final ArrayList<Instruction> instructions;


    public RecipeWriter(String name, ArrayList<Ingredient> ingredient_list, ArrayList<Instruction> instruction_list) {
        recipeName = name;
        ingredients = ingredient_list;
        instructions = instruction_list;
    }

    public void WriteRecipe() {
        System.out.println(recipeName);
        System.out.println();
        WriteIngredients();
        System.out.println();
        WriteInstructions();
    }

    private void WriteIngredients() {
        System.out.println("Ingrediënten: ");
        for (Ingredient ingredient : ingredients) {
            System.out.print(" - ");
            System.out.println(ingredient);
        }
    }

    private void WriteInstructions() {
        System.out.println("Bereidingswijze: ");
        for (Instruction instruction : instructions) {
            System.out.print(" - ");
            System.out.println(instruction);
        }
    }
}
