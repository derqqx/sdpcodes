package visitor;

public interface CarVisitor {
    void visit(Engine engine);
    void visit(Wheel wheel);
}