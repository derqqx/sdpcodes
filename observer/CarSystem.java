package observer;
import observer.subject.Car;
import observer.observers.Driver;
import observer.observers.Dashboard;
import observer.observers.MaintenanceService;
import java.util.Scanner;

public class CarSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(Messages.ENTER_DRIVER_NAME);
        String driverName = scanner.nextLine();

        Car car = new Car();
        Driver driver = new Driver(driverName);
        Dashboard dashboard = new Dashboard();
        MaintenanceService service = new MaintenanceService();

        car.addObserver(driver);
        car.addObserver(dashboard);
        car.addObserver(service);

        boolean running = true;
        while (running) {
            System.out.println(Messages.CHOOSE_ACTION);
            System.out.println(Messages.START_ENGINE_OPT);
            System.out.println(Messages.STOP_ENGINE_OPT);
            System.out.println(Messages.SPEED_UP_OPT);
            System.out.println(Messages.SLOW_DOWN_OPT);
            System.out.println(Messages.ADD_FUEL_OPT);
            System.out.println(Messages.EXIT_OPT);
            System.out.print(Messages.ENTER_CHOICE);

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> car.startEngine();
                    case 2 -> car.stopEngine();
                    case 3 -> car.speedUp();
                    case 4 -> car.slowDown();
                    case 5 -> car.addFuel(20);
                    case 6 -> {
                        System.out.println(Messages.EXITING);
                        running = false;
                    }
                    default -> System.out.println(Messages.INVALID_CHOICE);
                }
            } else {
                System.out.println(Messages.INVALID_CHOICE);
                scanner.next();
            }
        }
    }
}