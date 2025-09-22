package abstractfactory;

public class GermanAutoFactory implements AutoFactory {
    @Override
    public Car createCar() {
        return new SUV();
    }

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}
