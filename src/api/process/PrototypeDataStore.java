package api;

import project.annotations.ProcessAPIPrototype;

public class PrototypeDataStore {
    @ProcessAPIPrototype
    public void prototype(DataStore datastore) {
        DataStorageResponse storeResponse = datastore.storeData(new DataStorageRequest() {
        });

        DataLoadResponse loadResponse = datastore.loadData(storeResponse.getDataKey());
    }
}