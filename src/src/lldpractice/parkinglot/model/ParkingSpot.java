package lldpractice.parkinglot.model;

import lldpractice.parkinglot.exception.VehicleAlreadyParkedException;
import lldpractice.parkinglot.exception.VehicleNotParkedException;

public class ParkingSpot {

    public static final int DEFAULT_PRICE = 5;

    private final int spotId;
    private boolean isEmpty;
    private Vehicle vehicle;
    private int price;

    public ParkingSpot(int spotId) {
        this.spotId = spotId;
        this.isEmpty = true;
    }

    public void parkVehicle(Vehicle vehicle){
        if(this.vehicle != null){
            throw new VehicleAlreadyParkedException();
        }
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle(Vehicle vehicle){
        if(this.vehicle == null){
            throw new VehicleNotParkedException();
        }
        this.vehicle = null;
        this.isEmpty = true;
    }

    public int getPrice(){
        return DEFAULT_PRICE;
    }
}
