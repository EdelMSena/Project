package project.api.webserver.conceptualapi;

import project.annotations.ConceptualAPI;
import project.api.webserver.networkapi.InputDataResponse;
import project.api.webserver.conceptualapi.ComputeInputData;
import project.api.webserver.conceptualapi.NumIdentifier;
import project.api.webserver.conceptualapi.FactorsLoading;
import project.api.webserver.conceptualapi.OutputResponse;

public interface WebServer {

    @ConceptualAPI
    InputDataResponse input(ComputeInputData computeData);

    @ConceptualAPI
    FactorsLoading factorLoad(NumIdentifier num);

    @ConceptualAPI
    OutputResponse output(NumIdentifier num);
}