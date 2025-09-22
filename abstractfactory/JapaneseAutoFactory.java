package abstractfactory;

public class JapaneseAutoFactory implements AutoFactory {
    @Override
    public Car createCar() {
        return new Sedan(); // Японцы выпускают седаны
    }

    @Override
    public Engine createEngine() {
        return new ElectricEngine(); // С электродвигателем
    }
}
