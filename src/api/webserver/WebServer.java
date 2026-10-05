package api.webserver;

public interface WebServer {
    InputDataResponse input(ComputeInputData computeData);
    FactorsLoading factorLoad(NumIdentifier num);
    OutputResponse output(NumIdentifier num);
}