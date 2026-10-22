package api.datastore;

import project.annotations.ProcessAPI;

@ProcessApi
public interface DataStorageKey {
    DataLoadResponse sendLoad(LoadVal load);

    DataStorageResponse writeStore(StorageVal store);
}