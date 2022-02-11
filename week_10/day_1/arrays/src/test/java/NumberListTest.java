import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    public class numberListTest{
        private NumberList myNumbers;

        @Before
        public void before(){
           // myNumbers = new NumberList();
            ArrayList<Integer> testNumbers = new ArrayList<>();
            testNumbers.add(1);
            testNumbers.add(5);
            testNumbers.add(10);
            testNumbers.add(20);
            myNumbers = NumberList(testNumbers); //NumberList is the list. testNumbers is the parameter. you can have parameters in your constructor.
        }

        @Test
        public void hasNumberOfEntries()
        {
            assertEquals(0, myNumbers.getNumberCount());
        }

        @Test
        public void canAddValue(){
            myNumbers.addNumber(12);
            assertEquals(12, myNumbers.getNumberAtIndex(0)); //pass in number 0 to this function as index is 0
        }

        @Test
        public void canGetTotal(){
            myNumbers.addNumber(1);
            myNumbers.addNumber(2);
            myNumbers.addNumber(3);
            assertEquals(10, myNumbers.getTotal());

        }


    }

}
