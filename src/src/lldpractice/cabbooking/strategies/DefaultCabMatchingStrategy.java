package lldpractice.cabbooking.strategies;

import lldpractice.cabbooking.model.Cab;

import java.util.List;
import java.util.Optional;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy{

    @Override
    public Optional<Cab> getSuitableCab(List<Cab> closeByCabs) {
        //return closeByCabs.get(0);
        return closeByCabs.stream().filter(cab -> cab.getCurrentTrip() == null).findAny();
    }
}
