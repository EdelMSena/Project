import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestProcessAPI {

    @Test
    public void testProcessApiSmoke() {
        ProcessAPI processApi = new ProcessApiImpl();

        Assertions.assertNotNull(processApi);
    }
}