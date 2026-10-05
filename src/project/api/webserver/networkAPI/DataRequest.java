package project.api.webserver.networkapi;

import project.annotations.networkAPI;

public interface DataRequest {
    @NetworkAPI
    void processRequest();
}