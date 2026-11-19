package api.network;

import project.annotations.NetworkAPI;
import project.annotations.ConceptualAPI;
import project.annotations.ProcessAPI;

public class ConceptualImp implements ComputeInputData {
    private final ProcessApi processApi;

    public ConceptualImp(ProcessApi processApi) {
        this.processApi = processApi;
    }

    @Override
    public Object processComputation(Object input) {
        return null;
    }
}