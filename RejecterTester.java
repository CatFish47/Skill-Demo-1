import static org.junit.Assert.*;
import org.junit.*;

public class RejecterTester {
    @Test
    public void testReject() {
        assertEquals("SI!", Rejecter.reject("Puedo ir al bano?"));
    }
}
