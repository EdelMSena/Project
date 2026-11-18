import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import test.infrastructure.TestInMemoryDataStoreAPI;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ComputeEngineIntegrationTest {

    @Test
    public void testComputeEngineIntegrationPipeline() {
        List<Integer> initialInput = Arrays.asList(1, 10, 25);
        List<String> outputStorage = new ArrayList<>();

        TestInMemoryDataStoreAPI testDataStore = new TestInMemoryDataStoreAPI(initialInput, outputStorage);

        ProcessAPI processApi = new ProcessApiImpl();
        ConceptualAPI conceptualApi = new ConceptualApiImpl(processApi);
        NetworkAPI networkApi = new NetworkApiImpl(conceptualApi);

        List<Integer> data = testDataStore.readInput();
        Assertions.assertEquals(3, data.size());
        Assertions.assertEquals(1, data.get(0));
        Assertions.assertEquals(10, data.get(1));
        Assertions.assertEquals(25, data.get(2));

        networkApi.handleRequest(data);

        Assertions.assertNotNull(outputStorage);
    }
}