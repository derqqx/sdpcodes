package observer.observers;
import observer.Messages;

public class MaintenanceService implements Observer {
    @Override
    public void update(String message) {
        if (message.contains(Messages.FUEL_KEYWORD) || message.contains(Messages.WARNING_KEYWORD)) {
            System.out.printf(Messages.MAINTENANCE_CHECK, message);
        }
    }
}