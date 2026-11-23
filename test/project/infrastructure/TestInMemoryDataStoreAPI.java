package project.infrastructure;

import api.process.DataStorageKey;
import api.process.ReadVal;
import api.process.StorageVal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Test-only in-memory implementation of the process/data-store API. */
public class TestInMemoryDataStoreAPI implements DataStorageKey {
    private final List<String> inputValues;
    private final List<String> outputValues = new ArrayList<>();
    private int nextInputIndex;

    public TestInMemoryDataStoreAPI(List<Integer> inputNumbers) {
        this.inputValues = inputNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    @Override
    public ReadVal readStore(ReadVal request) {
        if (nextInputIndex >= inputValues.size()) {
            return null;
        }
        String value = inputValues.get(nextInputIndex++);
        return () -> value;
    }

    @Override
    public StorageVal writeStore(StorageVal value) {
        outputValues.add(value.getValue());
        return value;
    }

    public List<String> getOutputValues() {
        return new ArrayList<>(outputValues);
    }
}
