package api.webserver;

import java.util.List;

public enum DataResponseCode {

    private List factors;

    private setFactors(List factors){
        this.factors = factors;
    }

    public List getFactors() {
        return factors;
    }
}