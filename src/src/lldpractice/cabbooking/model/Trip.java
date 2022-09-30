package lldpractice.cabbooking.model;

import lombok.Getter;
import lombok.ToString;

enum TripStatus{
    IN_PROGRESS, CREATED, FINISHED;
}

@Getter
@ToString
public class Trip {

    private Rider rider;
    private Cab cab;
    private TripStatus status;
    private Double price;
    private Location fromLocation;
    private Location toLocation;

    public Trip(Rider rider, Cab cab, Double price, Location fromLocation, Location toLocation) {
        this.rider = rider;
        this.cab = cab;
        this.status = TripStatus.IN_PROGRESS;
        this.price = price;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    public void endTrip(){
        this.status = TripStatus.FINISHED;
    }

}
