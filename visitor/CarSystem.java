package visitor;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CarSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<CarElement> carElements = Arrays.asList(
                new Engine(),
                new Wheel(Messages.WHEEL_FRONT_LEFT),
                new Wheel(Messages.WHEEL_FRONT_RIGHT),
                new Wheel(Messages.WHEEL_REAR_LEFT),
                new Wheel(Messages.WHEEL_REAR_RIGHT)
        );

        boolean running = true;
        while (running) {
            System.out.println(Messages.CHOOSE_VISITOR);
            System.out.println(Messages.MAINTENANCE_OPT);
            System.out.println(Messages.DIAGNOSTIC_OPT);
            System.out.println(Messages.EXIT_OPT);
            System.out.print(Messages.ENTER_CHOICE);

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                CarVisitor visitor;

                switch (choice) {
                    case 1:
                        visitor = new MaintenanceVisitor();
                        System.out.println(Messages.MAINTENANCE_VISITOR);
                        break;
                    case 2:
                        visitor = new DiagnosticVisitor();
                        System.out.println(Messages.DIAGNOSTIC_VISITOR);
                        break;
                    case 3:
                        System.out.println(Messages.EXITING);
                        running = false;
                        continue;
                    default:
                        System.out.println(Messages.INVALID_CHOICE);
                        continue;
                }
                for (CarElement element : carElements) {
                    element.accept(visitor);
                }
            } else {
                System.out.println(Messages.INVALID_CHOICE);
                scanner.next();
            }
        }
    }
}