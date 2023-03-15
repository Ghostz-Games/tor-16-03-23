package TaskThree;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        Room room1 = new Room(4, 8, 12);
        Room room2 = new Room(2, 5, 6);
        Room room3 = new Room(1, 4, 8);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 4, 8, true);

    }

    public static int countLampsInBuilding(Building building) {
        int result = 0;
        for (Room r : building.rooms) {
            int i = r.getNumberOfLamps();
            result = result + i;

        }
        return result;
    }

    public static boolean isNormal(Building building) {
        if(building.getNumberOfFloors() > building.rooms.size()){
            return true;
        }else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
