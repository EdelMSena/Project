package api;

import api.webserver.ComputeInputData;
import api.webserver.FactorsLoading;
import api.webserver.InputDataResponse;
import api.webserver.NumIdentifier;
import api.webserver.WebServer;
import java.util.ArrayList;
import java.util.List;

public class PrototypeApi {
    public void prototype(WebServer server) {
        InputDataResponse inputResponse = server.input(new ComputeInputData() {
            @Override
            public List getSourceDetails() {
                return new ArrayList();
            }
        });

        if (inputResponse != null && inputResponse.getFactors() != null
                && inputResponse.getFactors().getFactors() != null
                && !inputResponse.getFactors().getFactors().isEmpty()) {
            NumIdentifier numIdentifier = inputResponse.getNumIdentifier();
            FactorsLoading loadFactors = server.factorLoad(numIdentifier);
            server.output(numIdentifier);
        }
    }
}
