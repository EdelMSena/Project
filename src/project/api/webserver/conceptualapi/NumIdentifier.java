package project.api.webserver.conceptualapi;

import project.annotations.ConceptualApi;

public interface NumIdentifier {
    @ConceptualAPI
    long getId();
}