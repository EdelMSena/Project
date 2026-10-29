package api;

import project.annotations.ConceptualAPIPrototype;

public class CIDPrototype {
    private ComputeInputData compute;

    public class CIDPrototype(ComputeInputData compute){
        this.compute = compute;
    }

    @ConceptualAPIPrototype
    public void getSourceDetails(DataRequest dataReq, FactorsLoading factors){
        DataRequest dataReq = new DataRequest();
        FactorsLoading fators = new FactorsLoading();
    }
}