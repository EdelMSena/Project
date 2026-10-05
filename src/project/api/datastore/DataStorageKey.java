package project.api.datastore;

import project.annotations.ProcessAPI;

public interface DataStorageKey {
    @ProcessAPI
    Object getValue();

    void setValue(Object value);
}