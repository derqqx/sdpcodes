package visitor;

public class Messages {
    public static final String CHOOSE_VISITOR = "\nChoose visitor type";
    public static final String MAINTENANCE_OPT = "1. Maintenance Check";
    public static final String DIAGNOSTIC_OPT = "2. Diagnostic Scan";
    public static final String EXIT_OPT = "3. Exit";
    public static final String ENTER_CHOICE = "Enter your choice: ";
    public static final String EXITING = "Exiting system";
    public static final String INVALID_CHOICE = "Invalid choice!";

    public static final String MAINTENANCE_VISITOR = "Performing maintenance check:";
    public static final String DIAGNOSTIC_VISITOR = "Running diagnostic scan:";

    public static final String NSTRING = "%n";

    public static final String ENGINE_NAME = "Engine";
    public static final String ENGINE_MAINTENANCE = "Checking Engine - Oil level OK";
    public static final String ENGINE_DIAGNOSTIC = "Scanning Engine - All systems normal";

    public static final String WHEEL_FRONT_LEFT = "Front Left Wheel";
    public static final String WHEEL_FRONT_RIGHT = "Front Right Wheel";
    public static final String WHEEL_REAR_LEFT = "Rear Left Wheel";
    public static final String WHEEL_REAR_RIGHT = "Rear Right Wheel";
    public static final String WHEEL_MAINTENANCE = "Checking %s - Pressure: 32 PSI";
    public static final String WHEEL_DIAGNOSTIC = "Testing %s - Alignment: Good";
    private Messages() {}
}