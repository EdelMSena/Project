package project.api.webserver.conceptualapi;

import java.util.List;

import project.annotations.conceptualapi;

public interface ComputeInputData {
    @ConceptualAPI

    List getSourceDetails();
}