package lldpractice.cabbooking.strategies;

import lldpractice.cabbooking.model.Location;

public class DefaultPricingStrategy implements PricingStrategy{

    public static final Double PER_DISTANCE_PRICE = 10.0;

    @Override
    public Double getRidePrice(Location fromLocation, Location toLocation) {
        Double price =  fromLocation.distance(toLocation) * PER_DISTANCE_PRICE;
        return price;
    }
}
