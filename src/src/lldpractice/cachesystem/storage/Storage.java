package lldpractice.cachesystem.storage;

import lldpractice.cachesystem.exceptions.NotFoundException;
import lldpractice.cachesystem.exceptions.StorageFullException;

public interface Storage {

    void add(String key, String value) throws StorageFullException;

    String get(String key) throws NotFoundException;

    void remove(String key) throws NotFoundException;
}
