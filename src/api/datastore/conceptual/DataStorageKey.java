package api.datastore;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface DataStorageKey {
    DataLoadResponse sendLoad(LoadVal load);

    DataStorageResponse writeStore(StorageVal store);
}