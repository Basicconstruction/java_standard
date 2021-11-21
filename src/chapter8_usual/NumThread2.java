package chapter8_usual;

public class NumThread2 implements Runnable{
    private int num;
    public NumThread2(int num){
        this.num =num;
    }
    public void run() {
        for(int i=1;i<=num;i++){
            System.out.print(i);
        }
        System.out.println();
    }
}

