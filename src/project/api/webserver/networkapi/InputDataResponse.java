package project.api.webserver.networkapi;

import java.util.List;
import project.annotations.NetworkAPI;
import project.api.webserver.networkapi.NumIdentifier;  // If in same package, no import needed

public interface InputDataResponse {

    @NetworkAPI
    DataResponseCode getFactors();

    @NetworkAPI
    NumIdentifier getNumIdentifier();
}