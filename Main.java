package com.example;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("engine: ");
    String engine = scanner.nextLine();

    System.out.print("wheels: ");
    int wheels = scanner.nextInt();
    scanner.nextLine();

    System.out.print("color: ");
    String color = scanner.nextLine();
    Car myCar = new Car.CarBuilder(engine, wheels)
            .setColor(color)
            .setEngine(engine)
            .build();

    System.out.println("\nur car:");
    System.out.println(myCar);
}
}