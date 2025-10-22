package decorator.concrete;

import decorator.Messages;
import decorator.abstractt.CarDecorator;
import decorator.component.Car;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(Messages.LUXURY_CAR_ASSEMBLE);
    }
}