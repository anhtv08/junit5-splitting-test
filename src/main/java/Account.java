public class Account {
    int balance;

    public int withdraw(int amount){
         if(amount > balance){
             throw new InSufficientFundException();
         }else {
             balance = balance -amount;
             return  balance;
         }
    }

    public int withdrawSlow(int amount) throws InterruptedException {

        Thread.sleep(10000);
        if(amount > balance){
            throw new InSufficientFundException();
        }else {
            balance = balance -amount;
            return  balance;
        }
    }
    public int topUp(int amount){
        if (amount < 0) throw new InvalidInput();
            balance = balance + amount;
        return balance;
    }

    public Account(int balance) {
        this.balance = balance;
    }
}
