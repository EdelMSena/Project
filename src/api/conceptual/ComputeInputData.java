package api.conceptual;

import java.util.List;
import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ComputeInputData {
    List getSourceDetails(DataRequest dataReq, FactorsLoading factors);
}