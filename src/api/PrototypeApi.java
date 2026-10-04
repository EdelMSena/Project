package api;

import api.webserver.*;

public class PrototypeApi{
    public void prototype(WebServer server){
        InputDataResponse inputResponse = server.input(new DataRequest() {});

        if(inputResponse.getFactors().getFactors()){  // Assuming this chain is intentional
            FactorsLoading loadFactors = server.factorLoad(inputResponse.getNumIdentifier());

            server.output(inputResponse.getNumIdentifier());
        }
    }
}
