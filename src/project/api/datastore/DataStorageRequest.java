package project.api.datastore;

import project.annotations.ProcessAPI;

public interface DataStorageRequest {
    @ProcessAPI
    void storeData();
}