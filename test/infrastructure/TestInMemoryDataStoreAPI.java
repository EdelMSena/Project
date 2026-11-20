package infrastructure;

import api.process.DataStorageKey;

import java.util.List;

public class TestInMemoryDataStoreAPI implements DataStorageKey {
    private final List<Integer> inputNumbers;
    private final List<String> outputLines;

    public TestInMemoryDataStoreAPI(List<Integer> inputNumbers, List<String> outputLines) {
        this.inputNumbers = inputNumbers;
        this.outputLines = outputLines;
    }

    public ReadVal readStore(ReadVal read) {
        return null;
    }

    public StorageVal writeStore(StorageVal store) {
        return null;
    }
}