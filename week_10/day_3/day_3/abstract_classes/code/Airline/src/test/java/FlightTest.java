import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    ArrayList<Passenger>bookedPassengers;
    Flight flight;
    Passenger passenger;


    @Before
    public void before(){
        pilot = new Pilot("Almas", "Flight Captain", "AB5000");
        cabinCrewMember = new CabinCrewMember("Claire", "Flight Attendant");
        //plane = new Plane(200, 412);
        passenger = new Passenger("Joe", 3);
        flight = new Flight("AirCanada111", "Toronto", "Edinburgh"
                , 10.00, 200, Plane.Boeing747);
    }

    @Test
    public void flightHasDestination(){
        assertEquals("Toronto", flight.getDestination());
    }

    @Test
    public void canReturnNumberOfAvailableSeats(){
        assertEquals(200, flight.getCapacity());
    }
    @Test
    public void canBookPassengersIfSeatsAvailable(){
        flight.addPassenger(passenger);

        assertEquals(1, flight.getBookedPassengers().size());
    }

}
