package Chapter3_standard.practice1;

public class AccountTest {
    public static void main(String[] args){
        Account a = new Account("wcx",10028922,300000.00,1);
        a.deposit(1000);
        a.withdraw(1000000);
        a.withdraw(10000);
    }
}
