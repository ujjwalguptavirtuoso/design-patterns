package lldpractice.cabbooking.controllers;

import lldpractice.cabbooking.database.RiderManager;
import lldpractice.cabbooking.database.TripsManager;
import lldpractice.cabbooking.model.Location;
import lldpractice.cabbooking.model.Rider;
import lldpractice.cabbooking.model.Trip;


import java.util.*;

public class RidersController {

    private RiderManager riderManager;
    private TripsManager tripsManager;

    public RidersController(RiderManager riderManager, TripsManager tripsManager) {
        this.riderManager = riderManager;
        this.tripsManager = tripsManager;
    }

    public void registerRider(String riderId, String riderName){
        Rider rider = new Rider(riderId, riderName);
        riderManager.createRider(rider);
    }

    public Trip book(String riderId, Double sourceX, Double sourceY, Double destX, Double destY){
       Trip trip = null;
        try{
           trip = tripsManager.createTrip(riderManager.getRider(riderId), new Location(sourceX,sourceY), new Location(destX, destY));
       }catch(Exception e){
           System.out.println("No cab available for this location currently. Please try again");
       }
        return trip;
    }

    public List<Trip> fetchHistory(String riderId){
        List<Trip> trips = tripsManager.tripHistory(riderManager.getRider(riderId));
        return trips;
    }

}
