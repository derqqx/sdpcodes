package assignment2;

public class GermanAutoFactory implements AutoFactory {
    @Override
    public Car createCar() {
        return new SUV();  //абстракт фактори
    }
}