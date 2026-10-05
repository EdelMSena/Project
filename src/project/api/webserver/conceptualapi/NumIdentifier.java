package project.api.webserver.networkapi;

import project.annotations.NetworkAPI;

public interface NumIdentifier {

    @NetworkAPI
    String getIdentifier();
}