package api;

import java.util.List;
import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ComputeInputData {
    InputDataResponse getSourceDetails(DataRequest dataReq, FactorsLoading factors);
}
//wrap list in object