import api.process.ProcessImp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProcessAPI {

    @Test
    public void testProcessApiSmoke() {
        ProcessImp processApi = new ProcessImp();

        Assertions.assertNotNull(processApi);
    }
}
