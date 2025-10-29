package strategy;
import strategy.concrete.CityMode;
import strategy.concrete.EcoMode;
import strategy.concrete.SportMode;
import strategy.context.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car = new Car(new CityMode());

        while (true) {
            System.out.println(Messages.CHOOSE_MODE);
            System.out.println(Messages.CITY_OPTION);
            System.out.println(Messages.SPORT_OPTION);
            System.out.println(Messages.ECO_OPTION);
            System.out.println(Messages.DRIVE_OPTION);
            System.out.println(Messages.EXIT_OPTION);
            System.out.print(Messages.ENTER_CHOICE);

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    car.setDrivingStrategy(new CityMode());
                    break;
                case 2:
                    car.setDrivingStrategy(new SportMode());
                    break;
                case 3:
                    car.setDrivingStrategy(new EcoMode());
                    break;
                case 4:
                    car.drive();
                    break;
                case 5:
                    System.out.println(Messages.EXITING);
                    return;
                default:
                    System.out.println(Messages.INVALID_CHOICE);
            }
        }
    }
}