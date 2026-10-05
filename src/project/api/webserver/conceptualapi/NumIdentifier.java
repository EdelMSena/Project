package project.api.webserver.conceptualapi;

import project.annotations.NetworkAPI;

@NetworkAPI
public class NumIdentifier {
    private long value;

    public NumIdentifier(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}