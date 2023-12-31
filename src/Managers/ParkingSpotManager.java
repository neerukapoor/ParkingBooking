package Managers;

import java.util.List;

import Services.ParkingSpot;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingStrategies parkingStrategies;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    ParkingSpot findParkingSpace(ParkingStrategies parkingStrategies) {
        this.parkingStrategies = parkingStrategies;
        ParkingSpot parkingSpot = parkingStrategies.find(parkingSpotList);
        return parkingSpot;
    }

    void addParkingSpace() {

    }

    void removeParkingSpace() {

    }

    void parkVehicle() {

    }

    void removeVehicle(int id) {
        for(ParkingSpot parkingSpot:parkingSpotList) {
            if(parkingSpot.getId()==id) {
                parkingSpot.setIsEmpty(true);
                System.out.println("Exit successful ");
                return;
            }
        }
        System.out.println("Wrong id ");
    }

    void parkingSpotStatus() {
        for(ParkingSpot parkingSpot : parkingSpotList) {
            System.out.println("id" + parkingSpot.getId() + " " + parkingSpot.getIsEmpty());
        }
    }

}
