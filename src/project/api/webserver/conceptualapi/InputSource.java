package project.api.webserver.conceptualapi;

import project.annotations.ConceptualAPI;

public interface InputSource {
    @ConceptualAPI

    String getSourceDetails();
}