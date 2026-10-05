package project.api.webserver.conceptualAPI;

import project.annotations.conceptualapi;

public interface WebServer {

    @ConceptualAPI

    InputDataResponse input(ComputeInputData computeData);
    FactorsLoading factorLoad(NumIdentifier num);
    OutputResponse output(NumIdentifier num);
}