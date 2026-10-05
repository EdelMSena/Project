package project.api.datastore;

import project.annotations.ProcessAPI;

public class PrototypeDataStore{

    @ProcessAPI

    public void prototype(DataStore datastore){
        DataStorageResponse storeResponse = datastore.storeData(new DataStorageRequest() {});

        DataLoadResponse loadResponse = datastore.loadData(storeResponse.getDataKey());
    }
}