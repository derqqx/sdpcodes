package strategy.context;

import strategy.Messages;
import strategy.interfacee.DrivingStrategy;

public class Car {
    private DrivingStrategy drivingStrategy;
    public Car(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
        System.out.println(Messages.CAR_STARTED + drivingStrategy.getModeName());
    }
    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
        System.out.println(Messages.MODE_CHANGED + drivingStrategy.getModeName());
    }
    public void drive() {
        System.out.println(Messages.DRIVING_IN + drivingStrategy.getModeName() + Messages.MODE);
        System.out.println(Messages.PERFORMANCE + drivingStrategy.adjustPerformance());
    }
}