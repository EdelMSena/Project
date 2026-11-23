package project;

import api.conceptual.ConceptualImp;
import api.network.Job;
import api.network.NetworkImp;
import api.process.ReadVal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import project.infrastructure.TestInMemoryDataStoreAPI;

import java.util.Arrays;
import java.util.List;

public class ComputeEngineIntegrationTest {

    @Test
    public void testComputeEngineIntegrationPipeline() {
        List<Integer> initialInput = Arrays.asList(1, 10, 25);
        TestInMemoryDataStoreAPI dataStore = new TestInMemoryDataStoreAPI(initialInput);

        ConceptualImp conceptual = new ConceptualImp(dataStore);
        NetworkImp network = new NetworkImp(conceptual);

        for (int i = 0; i < initialInput.size(); i++) {
            ReadVal input = dataStore.readStore(() -> "");
            Assertions.assertNotNull(input, "The test data store should provide each initial input value");
            network.submitJob(new Job(input.getValue()));
        }

        List<String> expectedOutput = Arrays.asList("1", "2*5", "5*5");
        //Assertions.assertEquals(expectedOutput, dataStore.getOutputValues());
    }
}

