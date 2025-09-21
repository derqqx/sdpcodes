package assignment2;

public class CarFactory {
    public Car createCar(String type) {
        if (type.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else {
            throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}    //фактоори метод