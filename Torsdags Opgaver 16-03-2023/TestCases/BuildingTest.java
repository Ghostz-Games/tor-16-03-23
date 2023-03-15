import TaskThree.Building;
import TaskThree.Main;
import TaskThree.Room;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class BuildingTest {

    @org.junit.jupiter.api.Test
    void isNotNormal() {
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room(4, 5, 4));
        Building building = new Building(rooms, 4, 0, true);

        assertEquals(false, Main.isNormal(building));
    }

    @org.junit.jupiter.api.Test
    void HasAmountLamps() {
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room(4, 3, 4));
        rooms.add(new Room(3,2,5));
        Building building = new Building(rooms, 4, 1, true);

        assertEquals(5, Main.countLampsInBuilding(building));


    }
}
