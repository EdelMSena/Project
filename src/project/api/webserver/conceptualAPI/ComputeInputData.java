package project.api.webserver.conceptualAPI;

import java.util.List;

import project.annotations.conceptualapi;

public interface ComputeInputData {
    @ConceptualAPI

    List getSourceDetails();
}