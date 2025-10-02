package bridge;

public class SUV extends Car {
    public SUV(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("SUV is driving. ");
        engine.start();
    }
}
