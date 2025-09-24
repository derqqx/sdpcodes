package adapter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose car type modern or old: ");
        String choice = sc.nextLine();

        Car car;
        if (choice.equalsIgnoreCase("modern")) {
            car = new ModernCar();
        } else if (choice.equalsIgnoreCase("old")) {
            car = new OldCarAdapter(new OldCar());
        } else {
            System.out.println("Unknown type");
            sc.close();
            return;
        }
        car.drive();
        sc.close();
    }
}