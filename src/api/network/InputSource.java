package api.network;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface InputSource {
    String getSourceDetails();
}