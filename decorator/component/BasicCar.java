package decorator.component;

import decorator.Messages;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println(Messages.BASIC_CAR_ASSEMBLE);
    }
}