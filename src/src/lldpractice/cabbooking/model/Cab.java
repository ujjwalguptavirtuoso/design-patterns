package lldpractice.cabbooking.model;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cab {

    private String id;
    private String driverName;

    @Setter Trip currentTrip;
    @Setter boolean isAvailable;
    @Setter Location currentLocation;

    public Cab(String id, String driverName) {
        this.id = id;
        this.driverName = driverName;
        this.isAvailable = true;
    }



}
