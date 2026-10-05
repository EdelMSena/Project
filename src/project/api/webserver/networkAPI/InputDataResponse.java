package project.api.webserver.networkAPI;

import java.util.List;

import project.annotations.NetworkAPI;
@NetworkAPI

public interface InputDataResponse {
    DataResponseCode getFactors();
    NumIdentifier getNumIdentifier();
}