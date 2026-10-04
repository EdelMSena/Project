package api;

import api.webserver.WebServer;
import api.webserver.InputDataResponse;
import api.webserver.ComputeInputData;
import api.webserver.FactorsLoading;
import api.webserver.NumIdentifier;

public class PrototypeApi{
    public void prototype(WebServer server){
        InputDataResponse inputResponse = server.input(new ComputeInputData() {});

        if(inputResponse.getFactors().getFactors() != null && !inputResponse.getFactors().getFactors().isEmpty()){
            FactorsLoading loadFactors = server.factorLoad(inputResponse.getNumIdentifier());
            server.output(inputResponse.getNumIdentifier());
        }
    }
}
