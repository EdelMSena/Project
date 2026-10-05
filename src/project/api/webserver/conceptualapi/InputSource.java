package project.api.webserver.conceptualapi;

import project.annotations.ConceptualApi;

public interface InputSource {
    @ConceptualAPI

    String getSourceDetails();
}