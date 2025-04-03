import java.util.HashSet;
import java.util.Set;

public class Flight {
    Number flightNumber;
    String destination;
    private Set<Passenger> passengers;

    public Flight (Number flightNumber, String destination,  Set<Passenger> passengers) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengers = new HashSet<>();
    }

    public String getDestination () {
        return destination;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger (Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger (Passenger passenger) {
        passengers.remove(passenger);
    }

    @Override
    public String toString() {
        return "Flight number" + flightNumber + "directed to" + destination + "with" + passengers.size() + "passengers";
    }
}
