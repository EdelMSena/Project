package smoketests;

import api.conceptual.ComputeInputData;
import api.network.NetworkImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestNetworkAPI {
    @Test
    public void testNetworkApiSmoke() {
        ComputeInputData mockConceptual = Mockito.mock(ComputeInputData.class);
        NetworkImp networkApi = new NetworkImp(mockConceptual);

        Assertions.assertNotNull(networkApi);
    }
}
