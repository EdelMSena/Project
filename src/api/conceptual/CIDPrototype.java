package api.conceptual;

import project.annotations.ConceptualAPIPrototype;


public class CIDPrototype {
    private ComputeInputData compute;

    public CIDPrototype(ComputeInputData compute) {
        this.compute = compute;
    }

    @ConceptualAPIPrototype
    public void getSourceDetails(ComputeInputData compute) {
        DataRequest dataReq = null;
        FactorsLoading factors = null;
        compute.getSourceDetails(dataReq, factors);
    }
}