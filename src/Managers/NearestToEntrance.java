package Managers;

import java.util.List;

import Services.ParkingSpot;

public class NearestToEntrance extends ParkingStrategies {
    ParkingSpot find(List<ParkingSpot> parkingSpots) {
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(parkingSpot.getIsEmpty()) {
                parkingSpot.setIsEmpty(false);
                return parkingSpot;
            }
        }
        return null;
    }
}
