package chapter8_usual;

public class LetterThread extends Thread{	 //自定义打印字母的线程类
    private char letter;
    private int num;
    public LetterThread(char ch,int num){
        letter=ch;
        this.num=num;
    }
    public void run(){	 //覆盖run()方法
        for(int i=0;i<num;i++){
            System.out.print(letter);
        }
        System.out.println();
    }
}

