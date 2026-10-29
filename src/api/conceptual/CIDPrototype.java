package api;

import project.annotations.ConceptualAPIPrototype;

public class CIDPrototype {
    private ComputeInputData compute;

    public CIDPrototype(ComputeInputData compute) {
        this.compute = compute;
    }

    @ConceptualAPIPrototype
    public void getSourceDetails(DataRequest dataReq, FactorsLoading factors) {
        DataRequest request = dataReq;
        FactorsLoading factorData = factors;
    }
}