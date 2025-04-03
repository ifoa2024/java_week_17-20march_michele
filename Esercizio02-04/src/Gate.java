public class Gate {
    private Number gateNumber;
    private Flight flight;
    
    public Gate(Number gateNumber, Flight flight) {
        this.gateNumber = gateNumber;
        this.flight = flight;
    }

    public Number getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(Number gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void addFlight(Flight fl) {
        this.flight = fl;
    }

    public void removeFlight() {
        this.flight = null;
    }

    @Override
    public String toString() {
        return "Gate number: " + gateNumber + "has flight directed to: " + flight.getDestination();
    }
}
