package project.api.webserver.conceptualAPI;

import project.annotations.conceptualapi;
@ConceptualAPI

public interface WebServer {
    InputDataResponse input(ComputeInputData computeData);
    FactorsLoading factorLoad(NumIdentifier num);
    OutputResponse output(NumIdentifier num);
}