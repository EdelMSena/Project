package api;

import api.webserver.WebServer;
import api.webserver.InputDataResponse;
import api.webserver.ComputeInputData;
import api.webserver.FactorsLoading;
import api.webserver.NumIdentifier;
import java.util.List;

public class PrototypeApi{
    public void prototype(WebServer server){
        InputDataResponse inputResponse = server.input(new ComputeInputData() {
            @Override
            public List getSourceDetails() {
                return new java.util.ArrayList();
            }
        });

        if(inputResponse.getFactors().getFactors() != null && !inputResponse.getFactors().getFactors().isEmpty()){
            FactorsLoading loadFactors = server.factorLoad(inputResponse.getNumIdentifier());
            server.output(inputResponse.getNumIdentifier());
        }
    }
}
