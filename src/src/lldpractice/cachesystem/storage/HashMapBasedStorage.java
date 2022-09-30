package lldpractice.cachesystem.storage;

import lldpractice.cachesystem.exceptions.NotFoundException;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasedStorage implements Storage{

    Map<String, String> map = new HashMap<>();

    @Override
    public void add(String key,  String value) {
          map.put(key, value);
    }

    @Override
    public String get(String key) {
       return map.get(key);
    }

    @Override
    public void remove(String key) throws NotFoundException {
        map.remove(key);
    }

}
