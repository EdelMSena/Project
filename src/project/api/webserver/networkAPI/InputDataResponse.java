package project.api.webserver.networkapi;

import java.util.List;

import project.annotations.networkAPI;
@NetworkAPI

public interface InputDataResponse {
    DataResponseCode getFactors();
    NumIdentifier getNumIdentifier();
}