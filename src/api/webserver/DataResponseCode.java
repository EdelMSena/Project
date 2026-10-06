package api.webserver;

import java.util.List;
import api.annotations.ConceptualAPI;

@ConceptualAPI
public enum DataResponseCode {
    DEFAULT(new java.util.ArrayList());  // Provide List argument

    private List factors;

    DataResponseCode(List factors) {
        this.factors = factors;
    }

    public List getFactors() {
        return factors;
    }
}