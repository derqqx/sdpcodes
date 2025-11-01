package observer.observers;
import observer.Messages;

public class Dashboard implements Observer {
    @Override
    public void update(String message) {
        System.out.printf(Messages.DASHBOARD_UPDATE, message);
    }
}