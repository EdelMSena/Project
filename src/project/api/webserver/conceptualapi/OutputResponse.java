package project.api.webserver.conceptualapi;

import project.annotations.ConceptualApi;

public interface OutputResponse {
    @ConceptualAPI
    void sendResponse();
}