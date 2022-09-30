package lldpractice.cachesystem;

import lldpractice.cachesystem.exceptions.StorageFullException;
import lldpractice.cachesystem.policies.EvictionPolicy;
import lldpractice.cachesystem.storage.Storage;

public class Cache {
   private Storage  storage;
   private EvictionPolicy evictionPolicy;

    public Cache(Storage storage, EvictionPolicy evictionPolicy) {
        this.storage = storage;
        this.evictionPolicy = evictionPolicy;
    }

    public void put(String key, String value){
        try{
            this.storage.add(key, value);
            this.evictionPolicy.keyAccessed(key);
        }catch(StorageFullException e){

        }
    }

    String get(String key){
        String value = this.storage.get(key);
        this.evictionPolicy.keyAccessed(key);
        return value;
    }


}
