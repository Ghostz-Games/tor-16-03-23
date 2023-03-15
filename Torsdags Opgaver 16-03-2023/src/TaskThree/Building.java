package TaskThree;

import java.util.ArrayList;

public class Building {

    final ArrayList<Room> rooms;

    private int numberOfBathrooms;
    private int numberOfFloors;

    private boolean isOfficeBuilding;

    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.numberOfFloors = numberOfFloors;
        this.numberOfBathrooms = numberOfBathrooms;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;

    }

    public ArrayList<Room> getRooms(){
        return this.rooms;
    }

    public int getNumberOfBathrooms(){
        return this.numberOfBathrooms;
    }

    public int getNumberOfFloors(){
        return this.numberOfFloors;
    }

    public boolean isOfficeBuilding(){
        return this.isOfficeBuilding;
    }

}
