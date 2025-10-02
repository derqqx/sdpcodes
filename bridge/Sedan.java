package bridge;

public class Sedan extends Car {
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.print("Sedan is driving. ");
        engine.start();
    }
}
