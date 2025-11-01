package observer;
public class Messages {
    public static final String ENTER_DRIVER_NAME = "Enter driver name: ";
    public static final String CHOOSE_ACTION = "\n=== Choose action ===";
    public static final String START_ENGINE_OPT = "1. Start engine";
    public static final String STOP_ENGINE_OPT = "2. Stop engine";
    public static final String SPEED_UP_OPT = "3. Speed up";
    public static final String SLOW_DOWN_OPT = "4. Slow down";
    public static final String ADD_FUEL_OPT = "5. Add fuel";
    public static final String EXIT_OPT = "6. Exit";
    public static final String ENTER_CHOICE = "Enter your choice: ";
    public static final String EXITING = "Exiting system...";
    public static final String INVALID_CHOICE = "Invalid choice!";

    public static final String ENGINE_STARTED = "Engine started";
    public static final String ENGINE_STOPPED = "Engine stopped";
    public static final String SPEED_CHANGED = "Speed changed: %d km/h";
    public static final String FUEL_ADDED = "Fuel added: %d liters";
    public static final String LOW_FUEL_WARNING = "WARNING: Low fuel level!";

    public static final String DRIVER_NOTIFICATION = "Driver %s notified: %s%n";
    public static final String DASHBOARD_UPDATE = "Dashboard: %s%n";
    public static final String MAINTENANCE_CHECK = "Service: %s - status check%n";

    public static final String FUEL_KEYWORD = "fuel";
    public static final String WARNING_KEYWORD = "WARNING";
    private Messages() {}
}