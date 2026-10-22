package api.datastore;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorageKey {
    DataLoadResponse sendLoad(LoadVal load);

    DataStorageResponse writeStore(StorageVal store);
}