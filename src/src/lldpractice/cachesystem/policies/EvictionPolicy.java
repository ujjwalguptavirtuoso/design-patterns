package lldpractice.cachesystem.policies;

public interface EvictionPolicy {

    void keyAccessed(String key);

    String evictKey(String key);
}
