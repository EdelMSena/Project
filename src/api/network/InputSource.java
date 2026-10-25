package api;

import project.annotations.NetworkAPI;
import Job;

@NetworkAPI
public interface InputSource {
    OutputResponse submitJob(Job job);
}
