package chapter8_usual;

public class NumThread extends Thread{	       //自定义打印数字的线程类
    private int num;
    public NumThread(int num){
        this.num=num;
    }
    public void run(){	//覆盖run()方法
        for(int i=1;i<=num;i++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
