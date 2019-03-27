
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.Assert;

@Tag("slow")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccountSlowTest {

    Account account;

    @Test
    @Tag("slow")
    public void slowTest() throws InterruptedException {
        account= new Account(100);
        System.out.println("in slow test");

        Assert.assertEquals(80,account.withdrawSlow(10));
        System.out.println("completed slow test");

    }


}