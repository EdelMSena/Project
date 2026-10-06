package api.datastore;

import api.annotations.ProcessAPI;

@ProcessAPI
public interface DataStore {
    DataStorageResponse storeData(DataStorageRequest request);
    DataLoadResponse loadData(DataStorageKey key);
}