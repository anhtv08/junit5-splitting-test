import category.UnitTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@UnitTest
class AccountFastTest {

    Account account;
    @Test
    public void quickTest(){
        account= new Account(100);

        assertEquals( 90, account.withdraw(10));
        System.out.println("in fast test");
    }

    @Test
    public void should_return_exception_for_invalid_topic (){
        account= new Account(100);
        RuntimeException runtimeException = assertThrows(InvalidInput.class , ()->  account.topUp(-1));
        Assertions.assertEquals("Topup amount must be a positive number", runtimeException.getMessage());

    }




}