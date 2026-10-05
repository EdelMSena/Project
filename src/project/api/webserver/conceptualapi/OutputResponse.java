package project.api.webserver.conceptualapi;

import project.annotations.ConceptualAPI;

public interface OutputResponse {
    @ConceptualAPI
    void sendResponse();
}