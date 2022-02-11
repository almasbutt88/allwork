import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private double departureTime;
    private int capacity;
    private ArrayList<Passenger> bookedPassengers = new ArrayList<>();
    private Plane plane;

    public Flight(String _flightNumber, String _destination, String _departureAirport,
                  double _departureTime, int _capacity,Plane planeType){
        this.flightNumber = _flightNumber;
        this.destination = _destination;
        this.departureAirport = _departureAirport;
        this.departureTime = _departureTime;
        this.capacity = _capacity;
        this.plane = planeType;
    };

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public void setBookedPassengers(ArrayList<Passenger> bookedPassengers) {
        this.bookedPassengers = bookedPassengers;
    }

    public void addPassenger(Passenger passenger) {

        if(Plane.Boeing747.get_seatCapacity() > bookedPassengers.size()){
            bookedPassengers.add(passenger);
        }


    }
}
