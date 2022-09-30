package lldpractice.cabbooking.database;

import lldpractice.cabbooking.model.Rider;
import java.util.*;

import java.util.HashMap;

public class RiderManager {

    Map<String, Rider> riderMap = new HashMap<>();

    public void createRider(Rider newRider){
        if(riderMap.containsKey(newRider.getId())){
            //rider already exist exception
        }
        riderMap.put(newRider.getId(), newRider);
    }

    public Rider getRider(String id){
        if(!riderMap.containsKey(id)){
            // throw rider not found exception
        }
        return riderMap.get(id);
    }

}
