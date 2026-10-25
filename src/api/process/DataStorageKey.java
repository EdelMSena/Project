package api;

import project.annotations.ProcessAPI;
import readVal;
import StorageVal;

@ProcessAPI
public interface DataStorageKey {
    DataReadResponse readStore(readVal read);

    DataStorageResponse writeStore(StorageVal store);
}