package api;

import api.ComputeInputData;
import api.FactorsLoading;
import api.InputDataResponse;
import api.NumIdentifier;
import api.WebServer;
import java.util.List;
import project.annotations.ConceptualAPIPrototype;

public class PrototypeApi {
    @ConceptualAPIPrototype
    public void prototype(WebServer server) {
        InputDataResponse inputResponse = server.input(new ComputeInputData() {
            @Override
            public List getSourceDetails() {
                return new java.util.ArrayList();
            }
        });
}
