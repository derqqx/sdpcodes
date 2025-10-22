package facade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarFacade car = new CarFacade();

        System.out.println(Messages.APP_TITLE);

        label:
        while (true) {
            System.out.println(Messages.COMMAND_PROMPT);
            String input = sc.nextLine().trim().toLowerCase();

            switch (input) {
                case "1":
                case "start":
                    car.startCar();
                    break;
                case "2":
                case "stop":
                    car.stopCar();
                    break;
                case "3":
                case "exit":
                    System.out.println(Messages.EXITING);
                    break label;
                default:
                    System.out.println(Messages.WRONG_COMMAND);
                    break;
            }
        }
    }
}