package lldpractice.cabbooking.database;

import lldpractice.cabbooking.exceptions.CabNotFoundException;
import lldpractice.cabbooking.model.Cab;
import lldpractice.cabbooking.model.Location;

import java.util.*;

public class CabsManager {

    Map<String, Cab> cabs = new HashMap<>();

    public Cab createCab(Cab cab){
         if(cabs.containsKey(cab.getId())){
             //cab already exist exception
         }
         cabs.put(cab.getId(), cab);
         return cab;
     }

    public Cab getCab(String id){
        if(!cabs.containsKey(id)){
            throw new CabNotFoundException();
        }
        return cabs.get(id);
    }

    public void updateCabLocation(String cabId, Location location){
        if(!cabs.containsKey(cabId)){
            throw new CabNotFoundException();
        }
        cabs.get(cabId).setCurrentLocation(location);
    }

    public void updateCabAvailability(String cabId, boolean newAvailability){
        if(!cabs.containsKey(cabId)){
            throw new CabNotFoundException();
        }
        cabs.get(cabId).setAvailable(newAvailability);
    }

    public List<Cab> getCabsWithinDistance(Location fromPoint, Double distance){
        List<Cab> result = new ArrayList<>();
        for(Cab cab : cabs.values()){
            if(cab.isAvailable() && cab.getCurrentLocation().distance(fromPoint) <= distance){
                result.add(cab);
            }
        }
        return result;
    }
}
