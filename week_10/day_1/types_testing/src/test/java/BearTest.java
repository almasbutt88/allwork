import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest{
    Bear bear;
    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 600.40);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }
    @Test
    public void hasWeight(){
    assertEquals(600.40, bear.getWeight(), 0.0);
    }
    @Test
    public void readyToHibernate(){
        assertEquals(true, bear.readyToHibernate());
    }
    @Test
    public void notReadyToHibernate(){
        bear = new Bear("Baloo", 25, 60.87); //we are taking the bear object which is already declared at the top and creating a new bear object
        assertEquals(false, bear.readyToHibernate());
    }
}

//to declare a float, you have to put 100.1f at the end, notice the F.
