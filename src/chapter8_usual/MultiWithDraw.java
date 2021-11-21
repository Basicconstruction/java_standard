package chapter8_usual;

public class MultiWithDraw extends Thread{ //取款线程类
    private Account account;       //账户
    private int amount;                //取款金额
    public MultiWithDraw(Account account,int amount){
        this.account=account;
        this.amount =amount;
    }
    public void run(){         //查看账户余额
        String str=Thread.currentThread().getName()+"取款前余额："+account.getBalance();
        try {
            sleep(5);//延长取款时间，凸显交互线程的问题
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str+"  取款："+account.withDraw(amount)+"	取款后余额："+account.getBalance());
    }
    public static void main(String[] args) {
        Account a=new Account(500);
        for(int i=1;i<=10;i++){
            (new MultiWithDraw(a,10+i)).start();
        }
    }
}


