package project.api.datastore;

import project.annotations.ProcessAPI;
@ProcessAPI
public interface DataStore {
    DataStorageResponse storeData(DataStorageRequest request);