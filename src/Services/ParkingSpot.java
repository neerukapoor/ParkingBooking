package Services;

import Entities.Vehicle;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public ParkingSpot(int id) {
        this.id = id;
        isEmpty = true;
    }

    public boolean getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean value) {
        this.isEmpty = value;
    }

    public int getId() {
        return id;
    }

    void parkVehicle(Vehicle vehicle) {

    }

    void removeVehicle() {

    }
}
