package factorymethod;

public class CarFactory {
    public Car createCar(String type) {
        if (type.equalsIgnoreCase("Sedan")) return new Sedan();
        if (type.equalsIgnoreCase("SUV")) return new SUV();
        if (type.equalsIgnoreCase("Truck")) return new Truck();
        if (type.equalsIgnoreCase("Motorcycle")) return new Motorcycle();
        throw new IllegalArgumentException("Unknown car: " + type);
    }
}
