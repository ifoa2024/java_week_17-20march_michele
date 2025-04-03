import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Airport {
    private String name;
    private String code;
    private String city;
    private String country;
    private List<Flight> flights;
    private List<Gate> gates;
    private List<Passenger> passengers;

    public Airport(String name, String code, String city, String country) {
        this.name = name;
        this.code = code;
        this.city = city;
        this.country = country;
        this.passengers = new ArrayList<>();
        this.gates = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public Passenger AddPassenger(String name, String surname, Number age) {
        Passenger pass = new Passenger("mike", "tyson", "50");
        passengers.add(pass);
        return pass;
    }

    public Flight addFlight (Number flightNumber, String destination, Set<Passenger> passengers) {
        Flight flight = new Flight(1, "London", passengers);
        flights.add(flight);
        return flight;
    }

    public  Gate addGate (Number gateNumber, Flight flight) {
        Gate gate = new Gate(gateNumber, flight);
        gates.add(gate);
        return gate;
    }

    public void assignFlightToPassenger (Passenger pass, Flight flight) {
        flight.addPassenger(pass);
    }

    public void removePassengerToFlight (Passenger pass, Flight flight) {
        flight.removePassenger(pass);
    }

    public void removeGateToFlight (Gate gate, Flight flight) {
        gate.removeFlight();
    }

    public void AssignFlightToGate (Flight flight, Gate gate) {
        gate.addFlight(flight);
    }

    public void AirportFlightList() {
        for (Flight flight : flights) {
            System.out.println("LISTA DEI VOLI PER L'AEROPORTO:" + getName() + " a " + getCity());
            System.out.println( "Flight number: " + flight.flightNumber + " directed to: " + flight.destination + " with " + flight.getPassengers().size() + " passengers." + "\n" + "Lista dei passeggeri:");
        }
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}