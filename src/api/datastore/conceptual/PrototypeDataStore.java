package api.datastore.conceptual;

public class PrototypeDataStore{
    public void prototype(DataStore datastore){
        @ConceptualAPIPrototype
        DataStorageResponse storeResponse = datastore.storeData(new DataStorageRequest() {});

        DataLoadResponse loadResponse = datastore.loadData(storeResponse.getDataKey());
    }
}