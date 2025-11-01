package observer.observers;
import observer.Messages;

public record Driver(String name) implements Observer {
    @Override
    public void update(String message) {
        System.out.printf(Messages.DRIVER_NOTIFICATION, name, message);
    }
}