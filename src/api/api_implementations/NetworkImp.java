package api;

public class NetworkImp implements InputSource {
    private final ConceptualApi conceptualApi;

    public NetworkImp(ConceptualApi conceptualApi) {
        this.conceptualApi = conceptualApi;
    }

    @Override
    public String handleRequest(Object requestData) {
        return "";
    }
}