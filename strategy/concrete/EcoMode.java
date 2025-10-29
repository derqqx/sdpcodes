package strategy.concrete;

import strategy.interfacee.DrivingStrategy;
import strategy.Messages;

public class EcoMode implements DrivingStrategy {
    @Override
    public String adjustPerformance() {
        return Messages.ECO_PERFORMANCE;
    }

    @Override
    public String getModeName() {
        return Messages.ECO_NAME;
    }
}