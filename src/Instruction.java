public class Instruction {
    public String description;

    public Instruction(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
