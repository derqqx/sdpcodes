package adapter;

public class OldCarAdapter implements Car {
    private OldCar oldCar;

    public OldCarAdapter(OldCar oldCar) {
        this.oldCar = oldCar;
    }

    @Override
    public void drive() {
        oldCar.move();
    }
}