package decorator.concrete;

import decorator.Messages;
import decorator.component.Car;
import decorator.abstractt.CarDecorator;

public class SportCar extends CarDecorator {
    public SportCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println(Messages.SPORT_CAR_ASSEMBLE);
    }
}