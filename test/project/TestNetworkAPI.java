package project;

import api.conceptual.ConceptualImp;
import api.network.NetworkImp;
import api.process.ProcessImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNetworkAPI {
    @Test
    public void testNetworkApiSmoke() {
        ProcessImp processApi = new ProcessImp();
        ConceptualImp conceptualApi = new ConceptualImp(processApi);
        NetworkImp networkApi = new NetworkImp(conceptualApi);

        Assertions.assertNotNull(networkApi);
    }
}
