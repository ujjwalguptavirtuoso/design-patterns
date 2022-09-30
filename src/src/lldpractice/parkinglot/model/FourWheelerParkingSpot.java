package lldpractice.parkinglot.model;

public class FourWheelerParkingSpot extends ParkingSpot{

    public FourWheelerParkingSpot(int spotId) {
        super(spotId);
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
