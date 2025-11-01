package observer.subject;
import observer.Messages;
import observer.observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private boolean engineOn;
    private int speed;
    private int fuelLevel;
    private final List<Observer> observers;
    public Car() {
        this.engineOn = false;
        this.speed = 0;
        this.fuelLevel = 50;
        this.observers = new ArrayList<>();
    }
    public void addObserver(Observer observer) {
        if (observer != null) {
            observers.add(observer);
        }
    }
    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void startEngine() {
        if (!engineOn) {
            engineOn = true;
            notifyObservers(Messages.ENGINE_STARTED);
        }
    }
    public void stopEngine() {
        if (engineOn) {
            engineOn = false;
            speed = 0;
            notifyObservers(Messages.ENGINE_STOPPED);
        }
    }
    public void speedUp() {
        if (engineOn && fuelLevel > 0) {
            speed += 10;
            fuelLevel -= 5;
            notifyObservers(String.format(Messages.SPEED_CHANGED, speed));

            if (fuelLevel < 10) {
                notifyObservers(Messages.LOW_FUEL_WARNING);
            }
        }
    }
    public void slowDown() {
        if (speed > 0) {
            speed -= 10;
            if (speed < 0) {
                speed = 0;
            }
            notifyObservers(String.format(Messages.SPEED_CHANGED, speed));
        }
    }
    public void addFuel(int amount) {
        if (amount > 0) {
            fuelLevel += amount;
            notifyObservers(String.format(Messages.FUEL_ADDED, amount));
        }
    }
}