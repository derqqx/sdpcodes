package bridge;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose car type (sedan or suv): ");
        String carType = sc.nextLine();

        System.out.print("Choose engine type (petrol or lectric): ");
        String engineType = sc.nextLine();

        Engine engine;
        if (engineType.equalsIgnoreCase("petrol")) {
            engine = new PetrolEngine();
        } else {
            engine = new ElectricEngine();
        }

        Car car;
        if (carType.equalsIgnoreCase("sedan")) {
            car = new Sedan(engine);
        } else {
            car = new SUV(engine);
        }
        car.drive();
    }
}