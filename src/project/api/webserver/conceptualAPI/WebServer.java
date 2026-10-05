package project.api.webserver.conceptualAPI;

import project.annotations.ProcessAPI;
@ProcessAPI

public interface WebServer {
    InputDataResponse input(ComputeInputData computeData);
    FactorsLoading factorLoad(NumIdentifier num);
    OutputResponse output(NumIdentifier num);
}