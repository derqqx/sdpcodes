package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // фактори
        System.out.println("Factory Method");
        System.out.print("Enter car type (Sedan/SUV): ");
        String type = sc.nextLine();
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar(type);
        System.out.println("Created: " + car.getName());

        // абстракт фактори
        System.out.println("\nAbstract Factory");
        System.out.print("Choose factory (German/Japanese): ");
        String factoryChoice = sc.nextLine();

        AutoFactory factory;
        if (factoryChoice.equalsIgnoreCase("German")) {
            factory = new GermanAutoFactory();
        } else {
            factory = new JapaneseAutoFactory();
        }
        Car factoryCar = factory.createCar();
        System.out.println("Factory produced: " + factoryCar.getName());

        sc.close();
    }
}