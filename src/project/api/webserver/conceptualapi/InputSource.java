package project.api.webserver.conceptualapi;

import project.annotations.conceptualapi;

public interface InputSource {
    @ConceptualAPI

    String getSourceDetails();
}