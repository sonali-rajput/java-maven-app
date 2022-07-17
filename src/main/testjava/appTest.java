import com.example.Application;
import org.junit.Test;
import static org.junit.Assert.*;

public class appTest {
    
    @Test
    public void testApp() {
        Application myapp = new Application();

        String result = myapp.getStatus();

        assertEquals("OK", result);
    }
}
