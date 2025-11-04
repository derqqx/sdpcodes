package visitor;

public class DiagnosticVisitor implements CarVisitor {
    @Override
    public void visit(Engine engine) {
        System.out.println(Messages.ENGINE_DIAGNOSTIC);
    }
    @Override
    public void visit(Wheel wheel) {
        System.out.printf((Messages.WHEEL_DIAGNOSTIC) + Messages.NSTRING, wheel.getName());
    }
}