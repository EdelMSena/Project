package com.example.api;

import com.example.annotations.ComceptualAPI;

import java.util.List;

@ComceptualAPI
public interface PrimeFactorEngineApi {
    List<String> factorize(int number);
}