package BankManager;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleTest {

    @Test
    public void testPublicInvokesPrivateMockUp() {
        new MockUp<Simple>() {
            @Mock
            String iAmPrivate() {
                return "MockUp Invoke";
            }
        };

        Simple simple = new Simple();
        String str = simple.publicCallsPrivate();
        assertEquals("MockUp Invoke", str);
    }
}
