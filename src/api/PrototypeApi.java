package api;

import api.webserver.*;

public class PrototypeApi{
    public void prototype(WebServer server){
        InputDataResponse inputResponse = server.dataInput(new DataRequest() {});

        if(inputResponse.getSourceDetails().getFactors()){
            FactorsLoading loadFactors = server.factorLoad(inputResponse.getNumIdentifier());

            FactorsLoading = server.factorLoad(inputResponse.getNumIdentifier());

            server.output(inputResponse.getNumIdentifier());
        }
    }
}
