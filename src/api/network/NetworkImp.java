package api.network;

import project.annotations.NetworkAPI;
import project.annotations.ConceptualAPI;
import project.annotations.ProcessAPI;


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