package lldpractice.parkinglot.model;

import lombok.Getter;

@Getter
public class Vehicle {

    private final  int vehicleNo;
    private final VehicleType vehicleType;

    public Vehicle(int vehicleNo, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }
}

enum VehicleType{
    TWO_WHEELER,
    FOUR_WHEELER;
}
