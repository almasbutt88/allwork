import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;
    @Before

    public void before(){
        person = new Person("Simon", "RoS"); //if these values are going to change, put them in getters and setters, otherwise in the constructor


    }
    @Test
    public void hasName(){
        assertEquals("Simon", person.getName());
    }
    @Test
    public void hasCohort(){
        assertEquals("RoS", person.getCohort());
    }
    @Test
    public void canChangeName(){
        person.setName("Tony");
        assertEquals("Tony", person.getName());//if you did person.name you wont have access coz its private in the person file
    }
    @Test
    public void canChangeCohort(){
        person.setCohort("RoS2");
        assertEquals("RoS2", person.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", person.talk("Java"));
    }
}
