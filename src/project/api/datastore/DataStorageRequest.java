package project.api.datastore;

import project.annotations.processapi;

public interface DataStorageRequest {
    @ProcessAPI
    void storeData();
}