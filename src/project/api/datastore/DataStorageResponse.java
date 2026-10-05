package project.api.datastore;

import project.annotations.ProcessAPI;

public interface DataStorageResponse {
    @ProcessAPI

    DataStorageKey getDataKey();

}