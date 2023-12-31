package Managers;

import Services.ParkingSpot;
import java.util.List;

import Entities.Vehicle;

public class EntryGate {
    ParkingSpotFactory parkingSpotFactory;
    ParkingSpotManager parkingSpotManager;

    public EntryGate(List<ParkingSpot> parkingSlots, Vehicle vehicle) {
        this.parkingSpotFactory = new ParkingSpotFactory(parkingSlots); 
        parkingSpotManager = parkingSpotFactory.getParkingSlotManager(vehicle);
    }

    public void findSpace(ParkingStrategies parkingStrategie) {
        ParkingSpot parkingSpot = parkingSpotManager.findParkingSpace(parkingStrategie);
        if(parkingSpot==null)
        {
            System.out.println("No Space Available");
            return;
        }
        System.out.println("Your Parking id: " + parkingSpot.getId());
    }

    public void removeSpace(int id) {
        parkingSpotManager.removeVehicle(id);
    }

    public void status() {
        parkingSpotManager.parkingSpotStatus();
    }

}
