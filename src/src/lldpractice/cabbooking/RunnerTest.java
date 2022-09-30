package lldpractice.cabbooking;

import lldpractice.cabbooking.controllers.CabsController;
import lldpractice.cabbooking.controllers.RidersController;
import lldpractice.cabbooking.database.CabsManager;
import lldpractice.cabbooking.database.RiderManager;
import lldpractice.cabbooking.database.TripsManager;
import lldpractice.cabbooking.model.Location;
import lldpractice.cabbooking.strategies.CabMatchingStrategy;
import lldpractice.cabbooking.strategies.DefaultCabMatchingStrategy;
import lldpractice.cabbooking.strategies.DefaultPricingStrategy;
import lldpractice.cabbooking.strategies.PricingStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RunnerTest {

    CabsController cabsController;
    RidersController ridersController;

    @BeforeEach
    void setUp(){
        CabsManager cabsManager = new CabsManager();
        RiderManager riderManager = new RiderManager();

        CabMatchingStrategy cabMatchingStrategy = new DefaultCabMatchingStrategy();
        PricingStrategy pricingStrategy = new DefaultPricingStrategy();

        TripsManager tripsManager = new TripsManager(riderManager, cabsManager, pricingStrategy, cabMatchingStrategy);

        cabsController = new CabsController(cabsManager, tripsManager);
        ridersController = new RidersController(riderManager, tripsManager);

    }

    @Test
    void testCabBookingFlow(){
        String rider1 = "Ujjwal";
        ridersController.registerRider(rider1, "rider1");

        String rider2 = "Ujjwal12";
        ridersController.registerRider(rider2, "rider2");

        String rider3 = "Ujjwal34";
        ridersController.registerRider(rider3, "rider3");

        String driver1 = "driver1";
        cabsController.registerCab(driver1, "driver1");

        String driver2 = "driver2";
        cabsController.registerCab(driver2, "driver2");

        String driver3 = "driver3";
        cabsController.registerCab(driver3, "driver3");

        cabsController.updateCabLocation(driver1, new Location(1.0, 1.0));
        cabsController.updateCabLocation(driver2, new Location(3.0, 3.0));
        cabsController.updateCabLocation(driver3, new Location(5.0, 5.0));

        cabsController.updateCabAvailability(driver1, true);
        cabsController.updateCabAvailability(driver2, false);
        cabsController.updateCabAvailability(driver3, true);

        ridersController.book(rider1, 2.0, 2.0, 25.0, 25.0);
        ridersController.book(rider2, 20.0, 20.0, 50.0, 50.0);

        System.out.println(ridersController.fetchHistory(rider1).toString());
    }
}
