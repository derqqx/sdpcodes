package strategy.concrete;

import strategy.interfacee.DrivingStrategy;
import strategy.Messages;

public class CityMode implements DrivingStrategy {
    @Override
    public String adjustPerformance() {
        return Messages.CITY_PERFORMANCE;
    }

    @Override
    public String getModeName() {
        return Messages.CITY_NAME;
    }
}