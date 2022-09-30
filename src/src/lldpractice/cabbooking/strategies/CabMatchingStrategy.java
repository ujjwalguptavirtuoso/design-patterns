package lldpractice.cabbooking.strategies;

import lldpractice.cabbooking.model.Cab;

import java.util.*;

public interface CabMatchingStrategy {

    Optional<Cab> getSuitableCab(List<Cab> closeByCabs);
}
