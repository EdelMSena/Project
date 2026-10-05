package project.api.datastore;

import project.annotations.processapi;
@ProcessAPI

public class PrototypeDataStore{
    public void prototype(DataStore datastore){
        DataStorageResponse storeResponse = datastore.storeData(new DataStorageRequest() {});

        DataLoadResponse loadResponse = datastore.loadData(storeResponse.getDataKey());
    }
}