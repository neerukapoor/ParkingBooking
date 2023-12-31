package Managers;

import Services.ParkingSpot;
import java.util.List;

abstract class ParkingStrategies {
    abstract ParkingSpot find(List<ParkingSpot> parkingSpot);
}
