package lldpractice.cabbooking.controllers;

import lldpractice.cabbooking.database.CabsManager;
import lldpractice.cabbooking.database.TripsManager;
import lldpractice.cabbooking.model.Cab;
import lldpractice.cabbooking.model.Location;

import java.util.UUID;

public class CabsController {

    private CabsManager cabsManager;
    private TripsManager tripsManager;

    public CabsController(CabsManager cabsManager, TripsManager tripsManager) {
        this.cabsManager = cabsManager;
        this.tripsManager = tripsManager;
    }

    public Cab registerCab(String driverId, String driverName){
        Cab cab = new Cab(driverId, driverName);
        return cabsManager.createCab(cab);
    }


    public void updateCabLocation(String id, Location location){
        cabsManager.updateCabLocation(id, location);
    }

    public void updateCabAvailability(String cabId, boolean newAvailability){
        cabsManager.updateCabAvailability(cabId, newAvailability);
    }
}
