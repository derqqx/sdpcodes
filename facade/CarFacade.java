package facade;

public class CarFacade {
    private final Engine engine;
    private final FuelSystem fuelSystem;
    private final ElectricalSystem electricalSystem;

    public CarFacade() {
        this.engine = new Engine();
        this.fuelSystem = new FuelSystem();
        this.electricalSystem = new ElectricalSystem();
    }

    public void startCar() {
        System.out.println(Messages.START_HEADER);

        String electricalStatus = electricalSystem.powerOn();
        System.out.println(electricalStatus);

        String fuelStatus = fuelSystem.fill();
        System.out.println(fuelStatus);

        String engineStatus = engine.start();
        System.out.println(engineStatus);

        System.out.println(Messages.START_SUCCESS);
    }

    public void stopCar() {
        System.out.println(Messages.STOP_HEADER);

        String engineStopStatus = engine.stop();
        System.out.println(engineStopStatus);

        String electricalStopStatus = electricalSystem.powerOff();
        System.out.println(electricalStopStatus);

        System.out.println(Messages.STOP_SUCCESS);
    }
}