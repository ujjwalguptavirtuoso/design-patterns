package lldpractice.cabbooking.strategies;

import lldpractice.cabbooking.model.Location;

public interface PricingStrategy {

    Double getRidePrice(Location fromLocation, Location toLocation);
}
