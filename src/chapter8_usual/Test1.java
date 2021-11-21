package chapter8_usual;

public class Test1 {
    public static void main(String[] args){
        NumThread nt = new NumThread(50);	//创建线程对象
        LetterThread lt = new LetterThread('a',50);
        nt.start();	    //启动线程对象
        lt.start();
    }
}