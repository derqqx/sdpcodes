package abstractfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose factory (German/Japanese): ");
        String choice = sc.nextLine();

        AutoFactory factory;
        if (choice.equalsIgnoreCase("German")) {
            factory = new GermanAutoFactory();
        } else if (choice.equalsIgnoreCase("Japanese")) {
            factory = new JapaneseAutoFactory();
        } else {
            System.out.println("Unknown");
            sc.close();
            return;
        }

        Car car = factory.createCar();
        Engine engine = factory.createEngine();

        System.out.println("Factory made: " + car.getName() + " with " + engine.getType());

        sc.close();
    }
}
