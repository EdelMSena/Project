import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TestConceptualAPI {

    @Test
    public void testConceptualApiSmoke() {
        ProcessAPI mockProcess = Mockito.mock(ProcessAPI.class);
        ConceptualAPI conceptualApi = new ConceptualApiImpl(mockProcess);

        Assertions.assertNotNull(conceptualApi);
    }
}