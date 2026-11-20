package infrastructure;

import java.util.List;

public class TestInMemoryDataStoreAPI implements DataStorageKey {
    private final List<Integer> inputNumbers;
    private final List<String> outputLines;

    public TestInMemoryDataStoreAPI(List<Integer> inputNumbers, List<String> outputLines) {
        this.inputNumbers = inputNumbers;
        this.outputLines = outputLines;
    }

    public List<Integer> readInput() {
        return inputNumbers;
    }

    public void writeOutput(List<String> results) {
        outputLines.addAll(results);
    }
}