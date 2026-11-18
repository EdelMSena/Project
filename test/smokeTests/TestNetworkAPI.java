import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TestNetworkAPI {
    @Test
    public void testNetworkApiSmoke() {
        ConceptualAPI mockConceptual = Mockito.mock(ConceptualAPI.class);
        NetworkAPI networkApi = new NetworkApiImpl(mockConceptual);

        Assertions.assertNotNull(networkApi);
    }
}