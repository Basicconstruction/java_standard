package chapter8_usual;

public class Account{	//账户类
    volatile private int balance;	//账户余额
    public Account(int balance){
        this.balance=balance;
    }
    public synchronized int getBalance(){//查看账户余额
        return balance;
    }
    public synchronized int withDraw(int amount) {	//取款，返回实际取款数
        if(amount<0){
            System.out.println("取款金额为负值！不能执行取款操作！");
            return 0;
        }
        else if(balance<amount){
            System.out.println("余额不足！不能执行取款操作！");
            return 0;
        }
        else {
            balance-=amount;
//            System.out.println(getBalance());
            return amount;
        }
    }
}


