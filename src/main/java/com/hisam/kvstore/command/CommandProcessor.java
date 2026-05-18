package com.hisam.kvstore.command;

import com.hisam.kvstore.store.KeyValueStore;

public class CommandProcessor {
    private final KeyValueStore store;

    public CommandProcessor(KeyValueStore store) {
        this.store = store;
    }
}
