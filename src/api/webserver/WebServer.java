package api.webserver;

import api.webserver.ComputeInputData;

public interface WebServer {
    InputDataResponse inputResponse = server.input(new ComputeInputData() {});
    FactorsLoading factorLoad(NumIdentifier num);
    OutputResponse output(NumIdentifier num);
}