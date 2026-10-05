package project.api.webserver.networkapi;

import java.util.List;

import project.annotations.networkAPI;
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