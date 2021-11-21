package chapter8_usual;

public class MultiWithDraw2 extends Thread {
    volatile private Account account;
    private int amount;
    public MultiWithDraw2(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
        synchronized (this.account){
            withdraw();
        }
    }
    public void withdraw(){
        String str = Thread.currentThread().getName() + "取款前余额："+ account.getBalance();
        System.out.println("2+"+str + "  取款：" + account.withDraw(amount)	+ "	取款后余额：" + account.getBalance());
    }
    public static void main(String[] args) {
        Account a = new Account(500);
        for (int i = 1; i <= 10; i++) {
            (new MultiWithDraw2(a, 10 + i)).start();
        }
    }
}



