package factorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarFactory factory = new CarFactory();

        System.out.print("Enter car type (Sedan/SUV/Truck/Motorcycle): ");
        String type = sc.nextLine();

        try {
            Car car = factory.createCar(type);
            System.out.println("Created by Factory Method: " + car.getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
