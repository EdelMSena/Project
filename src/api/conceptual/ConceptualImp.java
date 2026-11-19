package api.conceptual;

import api.process.DataStorageKey;

public class ConceptualImp implements ComputeInputData {
    private final DataStorageKey dataStorageKey;

    public ConceptualImp(DataStorageKey dataStorageKey) {
        this.dataStorageKey = dataStorageKey;
    }

    @Override
    public InputDataResponse getSourceDetails(
            DataRequest dataRequest,
            FactorsLoading factors) {
        return null;
    }
}