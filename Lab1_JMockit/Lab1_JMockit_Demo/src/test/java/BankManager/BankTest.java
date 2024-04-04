package BankManager;

import mockit.Mock;
import mockit.MockUp;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankTest {

    @Test
    public void testRetrieveLastName() {
        new MockUp<DBManager>() {
            @SuppressWarnings("unused")
            @Mock
            public String retrieveLastName(int accountId) {
                return "anoop";
            }
        };
        Bank bank = new Bank();
        String name = bank.processAccount(10);

        assertEquals("Last name for account has id 10  is ‘Anoop’", "anoop", name);
    }
}
