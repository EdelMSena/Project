package com.example.api.wrappers;

public class DelimiterOptions{
    private final String delimiter;

    public DelimiterOptions(){
        this.delimiter = ",";
    }

    public DelimiterOptions(String delimiter){
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }
}