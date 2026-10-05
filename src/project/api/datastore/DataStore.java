package project.api.datastore;

import project.annotations.ProcessAPI;

public interface DataStore {

    @ProcessAPI
    DataStorageResponse storeData(DataStorageRequest request);

    @ProcessAPI
    DataLoadResponse loadData(DataStorageKey key);
}