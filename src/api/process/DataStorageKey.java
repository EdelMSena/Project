package api;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorageKey {
    DataReadResponse readStore(readVal read);

    DataStorageResponse writeStore(StorageVal store);
}