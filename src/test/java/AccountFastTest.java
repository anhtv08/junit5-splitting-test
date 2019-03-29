import category.UnitTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.testng.Assert.assertEquals;

@UnitTest
class AccountFastTest {

    Account account;
    @Test
    @Tag("fast")
    public void quickTest(){
        account= new Account(100);

        assertEquals( 90, account.withdraw(10));
        System.out.println("in fast test");
    }




}