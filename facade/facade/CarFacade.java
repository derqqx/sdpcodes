package facade;

public class CarFacade {
    private Engine engine;
    private FuelSystem fuelSystem;
    private ElectricalSystem electricalSystem;

    public CarFacade() {
        this.engine = new Engine();
        this.fuelSystem = new FuelSystem();
        this.electricalSystem = new ElectricalSystem();
    }

    public void startCar() {
        System.out.println("starting car");
        electricalSystem.powerOn();
        fuelSystem.fill();
        engine.start();
        System.out.println("car started successfully\n");
    }

    public void stopCar() {
        System.out.println("stopping car");
        engine.stop();
        electricalSystem.powerOff();
        System.out.println("car stopped successfully\n");
    }
}
