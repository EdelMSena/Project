package com.example.api;

import com.example.annotations.ProcessAPI;
import com.example.api.wrappers.ComputeInputData;
import com.example.api.wrappers.ComputeOutputData;
import com.example.api.wrappers.InputSource;
import com.example.api.wrappers.OutputDestination;

@ProcessAPI
public interface DataStorageApi {

    ComputeInputData readData(InputSource source);

    boolean writeData(OutputDestination destination, ComputeOutputData outputData);
}