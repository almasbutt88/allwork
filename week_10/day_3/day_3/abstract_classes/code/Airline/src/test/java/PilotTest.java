import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;


    @Before
    public void before(){
        pilot = new Pilot("Almas", "Flight Captain", "AB5000");

    }

    @Test

    public void pilotHasName(){
        assertEquals("Almas", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("Flight Captain", pilot.getRank());
    }
    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("AB5000", pilot.getLicenseNumber());
    }

    @Test
    public void pilotCanFlyPlane(){

        assertEquals("The Pilot is now flying this plane", pilot.flyPlane());
    }


}
