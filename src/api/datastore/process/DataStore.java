package api.datastore.process;

import project.annotations.ProcessApi;

@ProcessApi
public interface DataStore {
    DataStorageResponse storeData(DataStorageRequest request);
    DataLoadResponse loadData(DataStorageKey key);
}