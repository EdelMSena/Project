package api.process;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface DataStorageKey {
    ReadVal readStore(ReadVal read);
    StorageVal writeStore(StorageVal store);
}