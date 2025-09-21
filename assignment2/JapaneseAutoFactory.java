package assignment2;

public class JapaneseAutoFactory implements AutoFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }    //абстракт фактори метод
}