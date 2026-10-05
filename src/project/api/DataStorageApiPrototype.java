package com.example.api.prototypes;

import com.example.annotations.ProcessAPIPrototype;
import com.example.api.DataStorageApi;
import com.example.api.wrappers.ComputeInputData;
import com.example.api.wrappers.ComputeOutputData;
import com.example.api.wrappers.InputSource;
import com.example.api.wrappers.OutputDestination;

import java.util.List;

public class DataStorageApiPrototype implements DataStorageApi {
    @Override
    @ProcessAPIPrototype
    public ComputeInputData readData(InputSource inputSource) {
        return () -> List.of(360,6);
    }

    @Override
    @ProcessAPIPrototype
    public boolean writeData(OutputDestination destination, ComputeOutputData outputData) {
        return true;
    }
}