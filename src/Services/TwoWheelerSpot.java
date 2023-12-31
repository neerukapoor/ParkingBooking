package Services;

//import Services.ParkingSpot;

public class TwoWheelerSpot extends ParkingSpot {

    public TwoWheelerSpot(int id) {
        super(id);
    }

    int price() {
        return 10;
    }
}
