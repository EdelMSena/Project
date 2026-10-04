package api.datastore;

public interface DataStore {
    DataStorageResponse storeData(DataStorageRequest request);
    DataLoadResponse loadData(DataStorageKey key);
}