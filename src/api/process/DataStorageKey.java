package api.process;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorageKey {
    DataLoadResponse sendLoad(LoadVal load);

    DataStorageResponse writeStore(StorageVal store);
}