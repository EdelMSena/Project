package api;

import project.annotations.ProcessAPIPrototype;

public class DSKPrototype {
    private final DataStorageKey key;

    public DSKPrototype(DataStorageKey key) {
        this.key = key;
    }

    @ProcessAPIPrototype
    public ReadVal readStore(ReadVal read) {
        return read;
    }

    public StorageVal writeStore(StorageVal store) {
        return store;
    }
}
