package decorator;

public final class Messages {
    public static final String APP_TITLE = "Decorator Pattern Demo";
    public static final String ASSEMBLY_PROCESS_HEADER = "\nCar Assembly Process";
    public static final String WRONG_CHOICE = "Invalid choice. Using Basic Car by default.";

    public static final String CHOICE_PROMPT = "Choose car type:";
    public static final String OPTION_BASIC = "1 - Basic Car"; // Case 1
    public static final String OPTION_SPORT_ONLY = "2 - Sport Car"; // Case 2 (Sport Decorator)
    public static final String OPTION_LUXURY_ONLY = "3 - Luxury Car"; // Case 3 (Luxury Decorator)
    public static final String OPTION_SPORT_LUXURY = "4 - Sport + Luxury Car"; // Case 4 (Stacked Decorators)


    public static final String BASIC_CAR_ASSEMBLE = "  [Step 1]: Basic body and chassis elements added.";
    public static final String SPORT_CAR_ASSEMBLE = "  [Add-on]: Installing Sport Package (spoiler, powerful engine).";
    public static final String LUXURY_CAR_ASSEMBLE = "  [Add-on]: Installing Luxury Interior (leather, navigation).";

    private Messages() {}
}