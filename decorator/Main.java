package decorator;

import decorator.component.BasicCar;
import decorator.component.Car;
import decorator.concrete.LuxuryCar;
import decorator.concrete.SportCar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Messages.APP_TITLE);
        Scanner sc = new Scanner(System.in);

        System.out.println(Messages.CHOICE_PROMPT);
        System.out.println(Messages.OPTION_BASIC);
        System.out.println(Messages.OPTION_SPORT_ONLY);
        System.out.println(Messages.OPTION_LUXURY_ONLY);
        System.out.println(Messages.OPTION_SPORT_LUXURY);

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
                System.out.println(Messages.WRONG_CHOICE);
                car = new BasicCar();
        }
        System.out.println(Messages.ASSEMBLY_PROCESS_HEADER);
        car.assemble();
    }
}