package visitor;

public interface CarElement {
    void accept(CarVisitor visitor);
    String getName();
}