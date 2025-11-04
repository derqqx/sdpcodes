package visitor;

public class Engine implements CarElement {
    @Override
    public void accept(CarVisitor visitor) {
        visitor.visit(this);
    }
    @Override
    public String getName() {
        return Messages.ENGINE_NAME;
    }
}