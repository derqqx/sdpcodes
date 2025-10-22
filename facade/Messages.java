package facade;
public final class Messages {
    public static final String COMMAND_PROMPT = "Enter command (1: start / 2: stop / 3: exit): ";
    public static final String EXITING = "Exiting application.";
    public static final String WRONG_COMMAND = "Invalid command. Try again.\n";
    public static final String APP_TITLE = "Facade Pattern Demonstration";

    public static final String START_HEADER = "Starting Car Process";
    public static final String START_SUCCESS = "Car started successfully\n";
    public static final String STOP_HEADER = "Stopping Car Process";
    public static final String STOP_SUCCESS = "Car stopped successfully\n";

    public static final String ELECTRIC_ON = "  [Electrical]: System powered on. Diagnostics passed.";
    public static final String ELECTRIC_OFF = "  [Electrical]: System powered off.";
    public static final String ENGINE_START = "  [Engine]: Started successfully.";
    public static final String ENGINE_STOP = "  [Engine]: Stopped.";
    public static final String FUEL_READY = "  [Fuel]: Fuel system ready.";

    private Messages() {}
}