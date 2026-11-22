package project;

import api.conceptual.ConceptualImp;
import api.conceptual.ComputeInputData;
import api.network.Job;
import api.network.NetworkImp;
import api.network.OutputResponse;
import api.process.ProcessImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import infrastructure.TestInMemoryDataStoreAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputeEngineIntegrationTest {

    @Test
    public void testComputeEngineIntegrationPipeline() {
        List<Integer> initialInput = Arrays.asList(1, 10, 25);
        List<String> outputStorage = new ArrayList<>();

        TestInMemoryDataStoreAPI testDataStore = new TestInMemoryDataStoreAPI(initialInput, outputStorage);

        ProcessImp processImp = new ProcessImp();
        ConceptualImp conceptualImp = new ConceptualImp(processImp);
        NetworkImp networkImp = new NetworkImp(conceptualImp);

        List<Integer> data = testDataStore.readInput();
        Assertions.assertEquals(3, data.size());
        Assertions.assertEquals(1, data.get(0));
        Assertions.assertEquals(10, data.get(1));
        Assertions.assertEquals(25, data.get(2));

        for (Integer value : data) {
            OutputResponse response = networkImp.submitJob(new Job(value.toString()));
        }

        Assertions.assertNotNull(outputStorage);
    }
}
