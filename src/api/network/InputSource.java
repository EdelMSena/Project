package api.network;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface InputSource {
    OutputResponse submitJob(Job job);
}
