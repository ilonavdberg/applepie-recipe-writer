import java.util.ArrayList;

public class ApplePieRecipe {
    public ArrayList<Ingredient> ingredients = new ArrayList<>();
    public ArrayList<Instruction> instructions = new ArrayList<>();

    public ApplePieRecipe() {
        ingredients.add(new Ingredient("roomboter", "gezouten", "gram", 250));
        ingredients.add(new Ingredient("basterd suiker", "witte", "gram", 200));
        ingredients.add(new Ingredient("zelfrijzend bakmeel", "gram", 400));
        ingredients.add(new Ingredient("ei", "stuk(s)", 1));
        ingredients.add(new Ingredient("vanillesuiker", "gram", 8));
        ingredients.add(new Ingredient("zout", "snuf", 1));
        ingredients.add(new Ingredient("appels", "zoetzure", "kilo", 1.5F));
        ingredients.add(new Ingredient("kristal suiker", "gram", 75));
        ingredients.add(new Ingredient("kaneel", "theelepels", 3));
        ingredients.add(new Ingredient("paneermeel", "gram", 15));

        instructions.add(new Instruction("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)"));
        instructions.add(new Instruction("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart."));
        instructions.add(new Instruction("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen."));
        instructions.add(new Instruction("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel."));
        instructions.add(new Instruction("Vet de springvorm in en bestrooi deze met bloem"));
        instructions.add(new Instruction("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op."));
        instructions.add(new Instruction("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm."));
        instructions.add(new Instruction("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed."));
        instructions.add(new Instruction("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken"));
        instructions.add(new Instruction("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin."));
    }

}
