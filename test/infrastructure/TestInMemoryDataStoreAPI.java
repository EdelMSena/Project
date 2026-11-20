package infrastructure;

import api.process.DataStorageKey;

import api.process.ReadVal;
import api.process.StorageVal;

public class TestInMemoryDataStoreAPI implements DataStorageKey {

    @Override
    public ReadVal readStore(ReadVal read) {
        return read;
    }

    @Override
    public StorageVal writeStore(StorageVal store) {
        return store;
    }
}