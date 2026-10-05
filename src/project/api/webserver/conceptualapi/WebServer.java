package project.api.webserver.conceptualapi;

import project.annotations.ConceptualApi;

public interface WebServer {

    @ConceptualAPI

    InputDataResponse input(ComputeInputData computeData);
    FactorsLoading factorLoad(NumIdentifier num);
    OutputResponse output(NumIdentifier num);
}