package api.webserver;

import java.util.List;
import api.annotations.NetworkAPI;

@NetworkAPI
public interface InputDataResponse {
    DataResponseCode getFactors();
    NumIdentifier getNumIdentifier();
}