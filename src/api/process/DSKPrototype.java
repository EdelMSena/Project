package api.process;

import project.annotations.ProcessAPIPrototype;

public class DSKPrototype {
    private final DataStorageKey key;

    public DSKPrototype(DataStorageKey key) {
        this.key = key;
    }

    @ProcessAPIPrototype
    public ReadVal readStore(DataStorageKey key) {
        return read;
    }

    public StorageVal writeStore(DataStorageKey key) {
        return store;
    }
}
