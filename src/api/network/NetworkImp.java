package api.network;

import api.conceptual.ComputeInputData;

public class NetworkImp implements InputSource {
    private final ComputeInputData computeInputData;

    public NetworkImp(ComputeInputData computeInputData) {
        this.computeInputData = computeInputData;
    }

    @Override
    public String submitJob(InputSource is){
        return "";
    }
}