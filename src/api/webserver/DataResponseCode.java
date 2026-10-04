package api.webserver;

import java.util.List;

public enum DataResponseCode {
    DEFAULT;  // Add at least one enum constant

    private List factors;

    DataResponseCode(List factors) {  // Remove 'private' keyword
        this.factors = factors;
    }

    public List getFactors() {
        return factors;
    }
}