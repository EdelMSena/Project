package com.example.api.prototypes;

import com.example.annotations.NetworkAPIProtoype;
import com.example.api.UserComputeApi;
import com.example.api.wrappers.DelimiterOptions;
import com.example.api.wrappers.InputSource;
import com.example.api.wrappers.OutputDestination;

public class UserComputeApiPrototypes implements UserComputeApi {

    @Override
    @NetworkAPIProtoype
    public String runJob(InputSource source, OutputDestination destination, DelimiterOptions delimiters) {
       DelimiterOptions activeDelimiters = (delimiters != null) ? delimiters : new DelimiterOptions();
       return "SUCCESS: Job submitted with delimiter '" + activeDelimiters.getDelimiter() + "'";
    }
}