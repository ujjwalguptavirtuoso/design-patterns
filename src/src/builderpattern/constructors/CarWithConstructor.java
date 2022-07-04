package builderpattern.constructors;

import java.util.*;
import builderpattern.carcomponents.*;

public class CarWithConstructor {

    // Required properties
    private Engine engine;
    private Fuel fuel;
    private List<Seat> seats;
    private Steering steering;

    // Optional properties
    private AirBags airBags;
    private CentralLock centralLock;
    private MusicSystem musicSystem;
    private SunRoof sunRoof;

    // Single Constructor
    public CarWithConstructor( Engine engine,  Fuel fuel,  List<Seat> seats,  Steering steering,
                              AirBags airBags, CentralLock centralLock, MusicSystem musicSystem, SunRoof sunRoof) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.steering = steering;
        this.airBags = airBags;
        this.centralLock = centralLock;
        this.musicSystem = musicSystem;
        this.sunRoof = sunRoof;
    }

    // Multiple Constructors for each combination

    public CarWithConstructor(Engine engine, Fuel fuel,  List<Seat> seats,  Steering steering,
                              AirBags airBags) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.steering = steering;
        this.airBags = airBags;
    }

    public CarWithConstructor( Engine engine, Fuel fuel, List<Seat> seats, Steering steering,
                              AirBags airBags, CentralLock centralLock) {
        this.engine = engine;
        this.fuel = fuel;
        this.seats = seats;
        this.steering = steering;
        this.airBags = airBags;
        this.centralLock = centralLock;
    }
}
