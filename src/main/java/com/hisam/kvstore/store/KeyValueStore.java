package com.hisam.kvstore.store;

import java.util.concurrent.ConcurrentHashMap;

public class KeyValueStore {
    private final ConcurrentHashMap<String, String> store = new ConcurrentHashMap<String, String>();

    public void set(String key, String value) {
        store.put(key, value);
    }

    public String get(String key) {
        return store.get(key);
    }

    public boolean exists(String key) {
        return store.containsKey(key);
    }

    public boolean delete(String key) {
        return store.remove(key) != null;
    }
}
