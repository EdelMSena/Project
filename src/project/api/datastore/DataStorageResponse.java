package project.api.datastore;

import project.annotations.processapi;

public interface DataStorageResponse {
    @ProcessAPI

    DataStorageKey getDataKey();

}