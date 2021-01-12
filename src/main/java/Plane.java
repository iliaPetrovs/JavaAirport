/**
 * Plane carrying passengers from an origin airport to a destination airport
 */
public class Plane {
    public String flightNumber;
    Passenger [] passengers;
    Airport origin;
    Airport destination;
    private int passengerCount;

    /**
     * Generates a plane with flight number
     * @param flightNumber String containing letters and numbers
     */
    public Plane(String flightNumber) {
        this.flightNumber = flightNumber;
        passengers = new Passenger[10];
        passengerCount = 0;
    }

    /**
     * Set the departure airport for the flight
     * @param origin Airport object
     */
    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    /**
     * Set the destination airport for the flight
     * @param destination Airport object
     */
    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    /**
     * Add a passenger to the boarding list
     * @param passenger Passenger object
     */
    public void boardPassenger(Passenger passenger) {
        this.passengers[passengerCount] = passenger;
        passengerCount++;
    }
}


