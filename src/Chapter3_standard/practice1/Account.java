package Chapter3_standard.practice1;
/**帮助信息：
 * 【练习3】模拟一个银行账户类Account，账户类中包括所有者、账号、余额、账户总数、存款、取款等信息。*/
public class Account {
    private String username;
    private long userAccountId;
    private double balance;
    private int accountNumber;
    public Account(String username,long userAccountId,double balance,int accountNumber){
        this.username = username;
        this.userAccountId = userAccountId;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public boolean deposit(double money){
        this.balance += Math.floor(money*100)/100;
        System.out.println("用户存储了"+Math.floor(money*100)/100+"元");
        return true;
    }
    public boolean withdraw(double money){
        if(this.balance>money){
            this.balance -= money;
            System.out.println("用户取钱"+money+"元.\n"+"状态成功");
            return true;
        }else{
            System.out.println("用户尝试取出"+money+"元,"+"但是余额不足.\n"+"取出失败");
            return false;
        }
    }

}
