package visitor;

public class Wheel implements CarElement {
    private final String name;

    public Wheel(String position) {
        this.name = position;
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }
}