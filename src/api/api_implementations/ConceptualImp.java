package api;

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