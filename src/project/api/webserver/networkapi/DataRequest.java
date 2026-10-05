package project.api.webserver.networkapi;

import project.annotations.NetworkAPI;

public interface DataRequest {
    @NetworkAPI
    void processRequest();
}