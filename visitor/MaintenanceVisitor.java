package visitor;

public class MaintenanceVisitor implements CarVisitor {
    @Override
    public void visit(Engine engine) {
        System.out.println(Messages.ENGINE_MAINTENANCE);
    }
    @Override
    public void visit(Wheel wheel) {
        System.out.printf((Messages.WHEEL_MAINTENANCE) + Messages.NSTRING, wheel.getName());
    }
}