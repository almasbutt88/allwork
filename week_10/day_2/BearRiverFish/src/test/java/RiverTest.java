import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


import java.util.ArrayList;

public class RiverTest {
    private River river;
    private Salmon salmon;

    @Before
    public void before(){
        river = new River();// create new river before it runs
        salmon = new Salmon();

    }
    @Test
    public void canAddSalmon(){
        river.addFish(salmon);
        assertEquals(1, river.fishCount());
    }
    @Test
    public void canGetSalmon(){
        river.addFish(salmon);
        river.removeFish();
        assertEquals(0, river.fishCount());
    }


}
