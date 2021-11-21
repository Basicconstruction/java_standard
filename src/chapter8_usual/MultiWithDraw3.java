package chapter8_usual;

public class MultiWithDraw3 extends Thread {
    volatile private Account account;
    private int amount;
    public MultiWithDraw3(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }
    public void run() {
//        withdrawdo();
        synchronized (account) {
            String str = Thread.currentThread().getName() + "取款前余额："+ account.getBalance();
//            try {
//                sleep(5); // 延长取款时间
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(str + "  取款：" + account.withDraw(amount)	+ "	取款后余额：" + account.getBalance());
        }
    }
    public synchronized void withdrawdo(){
        String str = Thread.currentThread().getName() + "取款前余额："+ account.getBalance();
        System.out.println("haha"+account.hashCode()+str + "  取款：" + account.withDraw(amount)	+ "	取款后余额：" + account.getBalance());
    }
    public static void main(String[] args) {
        Account a = new Account(500);
        for (int i = 1; i <= 3; i++) {
            (new MultiWithDraw3(a, 10 + i)).start();
        }
    }
}



