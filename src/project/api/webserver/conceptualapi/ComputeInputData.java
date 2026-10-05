package project.api.webserver.conceptualapi;

import java.util.List;

import project.annotations.ConceptualApi;

public interface ComputeInputData {
    @ConceptualAPI

    List getSourceDetails();
}