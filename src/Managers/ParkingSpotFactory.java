package Managers;

import Entities.*;
import Services.ParkingSpot;
import java.util.List;

public class ParkingSpotFactory {
    List<ParkingSpot> parkingSpots;

    public ParkingSpotFactory(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpotManager getParkingSlotManager(Vehicle vehicle) {
        if(vehicle.getVehicleType()==VehicleType.TwoWheeler) {
            return new TwoWheelerManager(parkingSpots);
        }
        return new FourWheelerManager(parkingSpots);
    }
}
