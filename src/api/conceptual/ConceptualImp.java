package api.conceptual;

import api.process.DataStorageKey;

public class ConceptualImp implements ComputeInputData {
    private final DataStorageKey dataStorageKey;

    public ConceptualImp(DataStorageKey dataStorageKey) {
        this.dataStorageKey = dataStorageKey;
    }

    @Override
    public Object processComputation(Object input) {
        return null;
    }
}