package facade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarFacade car = new CarFacade();

        while (true) {
            System.out.println("Enter command (start / stop / exit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("start")) {
                car.startCar();
            } else if (input.equalsIgnoreCase("stop")) {
                car.stopCar();
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Unknown command. Try again.\n");
            }
        }

        sc.close();
    }
}
