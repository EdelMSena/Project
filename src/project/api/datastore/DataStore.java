package project.api.datastore;

import project.annotations.processapi;

public interface DataStore {
    @ProcessAPI

    DataStorageResponse storeData(DataStorageRequest request);
    DataLoadResponse loadData(DataStorageKey key);
}