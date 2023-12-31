import java.util.*;

import Entities.Vehicle;
import Entities.VehicleType;
import Managers.EntryGate;
import Managers.FourWheelerManager;
import Managers.NearestToElevator;
import Managers.ParkingSpotManager;
//import Managers.ParkingStrategies;
import Managers.TwoWheelerManager;
import Services.ParkingSpot;

public class App {
    public static void main(String[] args) throws Exception {

        ParkingSpot parkingSpot1 = new ParkingSpot(1);
        ParkingSpot parkingSpot2 = new ParkingSpot(2);
        ParkingSpot parkingSpot3 = new ParkingSpot(3);
        List<ParkingSpot> parkingSpots1 = new ArrayList<>();
        parkingSpots1.add(parkingSpot1);
        parkingSpots1.add(parkingSpot2);
        parkingSpots1.add(parkingSpot3);
        // ParkingSpotManager parkingSpotManager1 = new TwoWheelerManager(parkingSpots1);
        Vehicle vehicle = new Vehicle(1, VehicleType.TwoWheeler);
        EntryGate entryGate = new EntryGate(parkingSpots1, vehicle);
        entryGate.findSpace(new NearestToElevator());

        Vehicle vehicle2 = new Vehicle(2, VehicleType.TwoWheeler);
        EntryGate entryGate2 = new EntryGate(parkingSpots1,vehicle2);
        entryGate2.findSpace(new NearestToElevator());

        Vehicle vehicle3 = new Vehicle(3, VehicleType.TwoWheeler);
        EntryGate entryGate3 = new EntryGate(parkingSpots1,vehicle3);
        entryGate3.findSpace(new NearestToElevator());

        Vehicle vehicle4 = new Vehicle(4, VehicleType.TwoWheeler);
        EntryGate entryGate4 = new EntryGate(parkingSpots1,vehicle4);
        entryGate4.findSpace(new NearestToElevator());

        entryGate4.status();

        entryGate4.removeSpace(3);
        entryGate4.status();
        

        // ParkingSpot parkingSpot4 = new ParkingSpot(4);
        // ParkingSpot parkingSpot5 = new ParkingSpot(5);
        // ParkingSpot parkingSpot6 = new ParkingSpot(6);
        // List<ParkingSpot> parkingSpots2 = new ArrayList<>();
        // parkingSpots2.add(parkingSpot4);
        // parkingSpots2.add(parkingSpot5);
        // parkingSpots2.add(parkingSpot6);
        // ParkingSpotManager parkingSpotManager2 = new FourWheelerManager(parkingSpots2);

    }
}
