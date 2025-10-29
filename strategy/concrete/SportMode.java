package strategy.concrete;

import strategy.interfacee.DrivingStrategy;
import strategy.Messages;

public class SportMode implements DrivingStrategy {
    @Override
    public String adjustPerformance() {
        return Messages.SPORT_PERFORMANCE;
    }
    @Override
    public String getModeName() {
        return Messages.SPORT_NAME;
    }
}