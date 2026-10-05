package project.api.datastore;

import project.annotations.processapi;

public interface DataStorageKey {
    @ProcessAPI
    Object getValue();

    void setValue(Object value);
}