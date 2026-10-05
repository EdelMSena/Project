package project.api.webserver.networkapi;

import java.util.List;
import project.annotations.NetworkAPI;

public enum DataResponseCode {
    DEFAULT(new java.util.ArrayList());

    private List factors;

    DataResponseCode(List factors) {
        this.factors = factors;
    }

    @NetworkAPI
    public List getFactors() {
        return factors;
    }
}