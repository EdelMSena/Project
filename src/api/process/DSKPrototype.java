package api.process;

import project.annotations.ProcessAPIPrototype;

public class DSKPrototype {
    private final DataStorageKey key;

    public DSKPrototype(DataStorageKey key) {
        this.key = key;
    }

    @ProcessAPIPrototype
    public void readStore(DataStorageKey key) {
        ReadVal read = null;
        key.readStore(read);
    }

    public void writeStore(DataStorageKey key) {
        StorageVal store = null;
        key.writeStore(store);
    }
}
