package com.example.api;

import com.example.annotations.NetworkApi;
import com.example.api.wrappers.DelimiterOptions;
import com.example.api.wrappers.InputSource;
import com.example.api.wrappers.OutputDestination;

@NetworkAPI
public interface UserComputeApi{
    String runJob(InputSource source, OutputDestination destination, DelimiterOptions delimiters);
}