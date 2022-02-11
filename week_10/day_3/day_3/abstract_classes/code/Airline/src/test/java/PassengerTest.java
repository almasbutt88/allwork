import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Almas", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Almas", passenger.getName());
    }

    @Test
    public void passengerHasB(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
