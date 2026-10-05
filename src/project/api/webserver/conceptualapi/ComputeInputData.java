package project.api.webserver.conceptualapi;

import java.util.List;

import project.annotations.ConceptualAPI;

public interface ComputeInputData {
    @ConceptualAPI

    List getSourceDetails();
}