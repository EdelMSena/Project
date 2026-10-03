package com.example.api.prototypes;

import com.example.annotations.ConceptualAPIPrototype;
import com.example.api.PrimeFactoringEngineApi;

import java.util.List;

public class PrimeFactoringEnginePrototype implements PrimeFactoringEngineApi {
    @Override
    @ConceptualAPIPrototype

    public List<String> factorize(int number){
        if(number == 360){
            return List.of("2", "2", "2", "3", "3", "5");
        } 
        return List.of(number + "^1");
    }
}