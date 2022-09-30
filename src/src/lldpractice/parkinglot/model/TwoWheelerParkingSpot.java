package lldpractice.parkinglot.model;

public class TwoWheelerParkingSpot extends ParkingSpot{

    public TwoWheelerParkingSpot(int spotId) {
        super(spotId);
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
