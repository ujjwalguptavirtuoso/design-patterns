package lldpractice.cabbooking.database;

import lldpractice.cabbooking.model.Cab;
import lldpractice.cabbooking.model.Location;
import lldpractice.cabbooking.model.Rider;
import lldpractice.cabbooking.model.Trip;
import lldpractice.cabbooking.strategies.CabMatchingStrategy;
import lldpractice.cabbooking.strategies.PricingStrategy;
import java.util.*;

public class TripsManager {

    public static final Double MAX_ALLOWED_TRIP_MATCHING_DISTANCE = 5.0;
    Map<String, List<Trip>> trips = new HashMap<>();

    private RiderManager riderManager;
    private CabsManager cabsManager;
    private PricingStrategy pricingStrategy;
    private CabMatchingStrategy cabMatchingStrategy;

    public TripsManager(RiderManager riderManager, CabsManager cabsManager, PricingStrategy pricingStrategy, CabMatchingStrategy cabMatchingStrategy) {
        this.riderManager = riderManager;
        this.cabsManager = cabsManager;
        this.pricingStrategy = pricingStrategy;
        this.cabMatchingStrategy = cabMatchingStrategy;
    }

    public Trip createTrip(Rider rider, Location fromLocation, Location toLocation){

           List<Cab> closeByCabs = cabsManager.getCabsWithinDistance(fromLocation, MAX_ALLOWED_TRIP_MATCHING_DISTANCE);
           Cab selectedCab = cabMatchingStrategy.getSuitableCab(closeByCabs).get();
           Double price = pricingStrategy.getRidePrice(fromLocation, toLocation);

           Trip newTrip = new Trip(rider, selectedCab, price, fromLocation, toLocation);
           if(!trips.containsKey(rider.getId())){
                   trips.put(rider.getId(), new ArrayList<>());
           }
           trips.get(rider.getId()).add(newTrip);
           selectedCab.setCurrentTrip(newTrip);
           return newTrip;

    }

    public List<Trip> tripHistory(Rider rider){
        return trips.get(rider.getId());
    }

    public void endTrip(Cab cab){
        if(cab.getCurrentTrip() == null){
            //already show no cab exception
        }
        cab.getCurrentTrip().endTrip();
        cab.setCurrentTrip(null);
    }
}
