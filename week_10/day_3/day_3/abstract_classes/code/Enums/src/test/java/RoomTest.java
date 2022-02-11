import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class RoomTest {
    Room room; //generate a class called room.

    @Before
    public void before() { //room type doesnt need to be instantiated like RoomType type - new Room(); all you have to do is Room. dot and it will give you your suggestions.
        room = new Room(RoomType.DOUBLE); //ONCE YOU DO THE ENUM, YOU CAN THEN AUTOPOPULATE INSIDE THE ROOM() BRACKET WITH CHOICES LIKE SINGLE DOUBLE
        //the enums are static which means you can only have one instance of those in your whole code.
    }//enums are static by default.

    @Test
    public void canGetRoomType() { //command N to open the menu for getters and setters
        assertEquals("Double", room.getRoomType()); //and you can do class.room type so capital Room.

    }
}
