package project;

import api.conceptual.ConceptualImp;
import api.process.ProcessImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConceptualAPI {

    @Test
    public void testConceptualApiSmoke() {
        ProcessImp processApi = new ProcessImp();
        ConceptualImp conceptualApi = new ConceptualImp(processApi);

        Assertions.assertNotNull(conceptualApi);
    }
}
