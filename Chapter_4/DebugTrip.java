// A Trip has three constructors
// When one argument is passed, it is the trip destination
// When two arguments are passed, they are the destination and departure cities
// When three arguments are passed, the last one is the mode of transportation for the trip

public class DebugTrip {
    private String destination;
    private String departure;
    private String mode;

    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";

    // Constructor with 1 argument (destination only)
    public DebugTrip(String destination) {
        // Chain to 3-arg constructor with defaults
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }

    // Constructor with 2 arguments (destination + departure)
    public DebugTrip(String destination, String departure) {
        // Wrong before: tried to call two constructors
        // Fixed: call 3-arg constructor with DEFAULT_MODE
        this(destination, departure, DEFAULT_MODE);
    }

    // Constructor with 3 arguments (destination + departure + mode)
    public DebugTrip(String destination, String departure, String mode) {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }

    // Getter for destination
    public String getDestination() {
        return destination;
    }

    // Getter for departure
    public String getDepartureCity() {
        return departure;
    }

    // Getter for mode
    public String getMode() {
        return mode;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test with 1-argument constructor
        DebugTrip trip1 = new DebugTrip("New York");
        System.out.println("Trip1 -> Destination: " + trip1.getDestination() +
                           ", Departure: " + trip1.getDepartureCity() +
                           ", Mode: " + trip1.getMode());

        // Test with 2-argument constructor
        DebugTrip trip2 = new DebugTrip("Los Angeles", "Miami");
        System.out.println("Trip2 -> Destination: " + trip2.getDestination() +
                           ", Departure: " + trip2.getDepartureCity() +
                           ", Mode: " + trip2.getMode());

        // Test with 3-argument constructor
        DebugTrip trip3 = new DebugTrip("Chicago", "Dallas", "train");
        System.out.println("Trip3 -> Destination: " + trip3.getDestination() +
                           ", Departure: " + trip3.getDepartureCity() +
                           ", Mode: " + trip3.getMode());
    }
}

