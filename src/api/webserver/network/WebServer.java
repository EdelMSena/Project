package api.webserver.network;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface WebServer {
    InputDataResponse input(ComputeInputData computeData);
    FactorsLoading factorLoad(NumIdentifier num);
    OutputResponse output(NumIdentifier num);
}