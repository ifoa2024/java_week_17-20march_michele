import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Airport airport = new Airport("Los Angeles International Airport", "LAX", "Los Angeles", "USA");

        Passenger p1 = airport.AddPassenger("John", "Doe", 30);
        Passenger p2 = airport.AddPassenger("michele", "misseri", 70 );
        Passenger p3 = airport.AddPassenger("mario", "rossi", 50 );
        Passenger p4 = airport.AddPassenger("mario", "qwerty", 60 );

        Flight firstFlight = airport.addFlight(1, "London", new HashSet<>(Arrays.asList(p1, p2)));
        Flight secondFlight = airport.addFlight(2, "Rimini", Set.of(p3, p4));
        
        Gate g1 = airport.addGate(1, firstFlight);
        Gate g2 = airport.addGate(2, secondFlight);

        airport.assignFlightToPassenger(p1, firstFlight);
        airport.assignFlightToPassenger(p2, firstFlight);
        airport.assignFlightToPassenger(p3, secondFlight);
        airport.assignFlightToPassenger(p4, secondFlight);


        airport.AssignFlightToGate(firstFlight, g1);
        airport.AssignFlightToGate(secondFlight, g2);

        airport.AirportFlightList();

        airport.removeGateToFlight(g2, secondFlight);

        airport.removePassengerToFlight(p1, firstFlight);

        airport.AirportFlightList();
        
        

    }
}
