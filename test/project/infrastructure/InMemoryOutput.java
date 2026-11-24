package project.infrastructure;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOutput {
    private final List<String> outputLines = new ArrayList<>();

    public List<String> getOutputLines() {
        return outputLines;
    }
}
