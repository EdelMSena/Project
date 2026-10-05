package project.api.webserver.networkapi;

import java.util.List;

import project.annotations.NetworkAPI;

public enum DataResponseCode {
    @NetworkAPI

    DEFAULT(new java.util.ArrayList());  // Provide List argument

    private List factors;

    DataResponseCode(List factors) {
        this.factors = factors;
    }

    public List getFactors() {
        return factors;
    }
}