package api.datastore;

public class PrototypeDataStore{
    public void prototype(DataStore datastore){
        DataStorageResponse storeResponse = dataStore.storeData(new DataStorageRequest() {});

        DataLoadResponse loadResponse = dataStore.loadData(storeResponse.getDataKey());
    }
}