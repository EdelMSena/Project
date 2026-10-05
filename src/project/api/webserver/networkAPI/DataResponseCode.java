package project.api.webserver.networkAPI;

import java.util.List;

import project.annotations.NetworkAPI;
@NetworkAPI

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