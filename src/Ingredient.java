public class Ingredient {
    public String name;
    public String characteristic;
    public String unit;
    public float quantity;

    public Ingredient(String name, String characteristic, String unit, int quantity) {
        this.name = name;
        this.characteristic = characteristic;
        this.unit = unit;
        this.quantity = quantity;
    }

    public Ingredient(String name, String characteristic, String unit, float quantity) {
        this.name = name;
        this.characteristic = characteristic;
        this.unit = unit;
        this.quantity = quantity;
    }

    public Ingredient(String name, String unit, float quantity) {
        this.name = name;
        this.unit = unit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        if (quantity % 1 == 0 && characteristic == null) {
            return (int) quantity + " " + unit + " " + name;
        }
        if (quantity % 1 == 0 && characteristic != null) {
            return (int) quantity + " " + unit + " " + characteristic + " " + name;
        }
        if (characteristic == null) {
            return quantity + " " + unit + " " + name;
        }
        return quantity + " " + unit + " " + characteristic + " " + name;
    }
}
