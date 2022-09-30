package lldpractice.cabbooking.model;

import lombok.Getter;

@Getter
public class Location {

    private Double x;
    private Double y;

    public Location(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double distance(Location location){
        return Math.sqrt(Math.pow(location.getX() - x,2) + Math.pow(location.getY() - y,2 ));
    }
}
