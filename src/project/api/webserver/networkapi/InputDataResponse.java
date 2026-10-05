package project.api.webserver.networkapi;

import java.util.List;

import project.annotations.NetworkAPI;

public interface InputDataResponse {

    @NetworkAPI

    DataResponseCode getFactors();
    NumIdentifier getNumIdentifier();
}