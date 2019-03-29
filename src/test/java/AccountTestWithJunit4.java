import category.UnitTest;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

@UnitTest
public class AccountTestWithJunit4 {

    @Test
    public void test_with_junt4(){

        Account account = new Account(100);
        Assertions.assertEquals(90, account.withdraw(10));

    }


}
