
import category.UatTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

@UatTest
class AccountSlowTest {

    Account account;

    @Test
    public void slowTest() throws InterruptedException {
        account= new Account(100);
        System.out.println("in slow test");
        assertTimeout(Duration.ofSeconds(1), ()-> account.withdrawSlow(10));
//        Assertions.assertEquals(90,account.withdrawSlow(10));
        System.out.println("completed slow test");

    }


}