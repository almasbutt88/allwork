import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    @Before

    public void before(){
        cabinCrewMember = new CabinCrewMember("Claire", "Flight Attendant");
    }

    @Test

    public void cabinCrewMemberHasName(){
        assertEquals("Claire", cabinCrewMember.getName());
    }
    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals("Flight Attendant", cabinCrewMember.getRank());
    }




}
