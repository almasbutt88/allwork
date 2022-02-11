import attractions.*;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    CandyflossStall candyflossStall;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollercoaster;
    IceCreamStall iceCreamStall;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;
    ThemePark themePark;

    @Before
    public void before(){
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        dodgems = new Dodgems("Super Dodgems", 5);
        park = new Park("Disneyland", 4);
        playground = new Playground ("Kids Playground", 5);
        rollercoaster = new RollerCoaster("Death Rider", 5);
        iceCreamStall = new IceCreamStall("Magnum", "Almas", ParkingSpot.A4);
        themePark = new ThemePark();
        themePark.addAttraction(dodgems);
        themePark.addAttraction(rollercoaster);
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
    }

    @Test
    public void canViewAllReviewed(){
       ArrayList<IReviewed> getReviewed = new ArrayList();

        assertEquals(4, themePark.getAllReviewed().size());

    }



}
