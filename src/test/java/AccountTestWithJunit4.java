import category.UnitTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

@UnitTest
public class AccountTestWithJunit4 {
    Account account;

    @Before
    public void init(){
         account = new Account(100);
    }
    @Test
    @DisplayName("testing should execute with junit 4")

    public void test_with_junt4(){

        Assertions.assertEquals(90, account.withdraw(10));
    }

    @Test
    @DisplayName("should return the correct balance")
    public void test_show_balance(){
        Assertions.assertEquals(100, account.showBalance());
    }


}
