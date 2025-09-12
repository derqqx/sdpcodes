package com.example;

import java.util.Scanner;

public class car {
    private String engine;
    private int wheels;
    private String color;

    private car(carBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "car {" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' + '}';
    }

    public static class carBuilder {
        private String engine;
        private int wheels;
        private String color;

        public carBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public carBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public car build() {
            return new car(this);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("engine: ");
        String engine = scanner.nextLine();

        System.out.print("wheels: ");
        int wheels = scanner.nextInt();
        scanner.nextLine();

        System.out.print("color: ");
        String color = scanner.nextLine();
        car myCar = new car.carBuilder(engine, wheels)
                .setColor(color)
                .build();

        System.out.println("\nur car:");
        System.out.println(myCar);
    }
}