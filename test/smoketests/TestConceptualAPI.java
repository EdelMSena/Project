package smoketests;

import api.conceptual.ConceptualImp;
import api.process.DataStorageKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestConceptualAPI {

    @Test
    public void testConceptualApiSmoke() {
        DataStorageKey mockProcess = Mockito.mock(DataStorageKey.class);
        ConceptualImp conceptualApi = new ConceptualImp(mockProcess);

        Assertions.assertNotNull(conceptualApi);
    }
}
