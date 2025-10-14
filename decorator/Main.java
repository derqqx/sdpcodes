package decorator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose car type:");
        System.out.println("1 - Basic Car");
        System.out.println("2 - Sport Car");
        System.out.println("3 - Luxury Car");
        System.out.println("4 - Sport + Luxury Car");

        int choice = sc.nextInt();
        Car car;

        switch (choice) {
            case 1:
                car = new BasicCar();
                break;
            case 2:
                car = new SportCar(new BasicCar());
                break;
            case 3:
                car = new LuxuryCar(new BasicCar());
                break;
            case 4:
                car = new LuxuryCar(new SportCar(new BasicCar()));
                break;
            default:
                System.out.println("Invalid choice. Using Basic Car by default.");
                car = new BasicCar();
        }
        System.out.println("\nCar assembly process:");
        car.assemble();
    }
}