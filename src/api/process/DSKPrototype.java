package api;

import project.annotations.ProcessAPIPrototype;

public class DSKPrototype {
    private DataStorageKey key;

    public class DSKPrototype(DataStorageKey key){
        this.key = key;
    }

    @ProcessAPIPrototype
    public void readStore(ReadVal read, StorageVal store){
        ReadVal read = new ReadVal();
    }
    public void writeStore(StorageVal store){
        StorageVal store = new StorageVal();
    }
}