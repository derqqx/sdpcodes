package com.example;
import java.util.Scanner;

public class Car {
    private String engine;
    private int wheels;
    private String color;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "ur car is {" +
                "engine='" + engine + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' + '}';

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public  void setEngine(String engine) {
        this.engine = engine;
    }

    public static class CarBuilder {
        private String engine;
        private int wheels;
        private String color;

        public CarBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public  CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }




        public Car build() {
            return new Car(this);
        }

    }
}