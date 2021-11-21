package chapter8_usual;

public class Test2 {
    public static void main(String[] args)	{
        LetterThread lt=new LetterThread('a',50);
        //创建具有线程体目标对象
        NumThread nt=new NumThread(50);
        Thread t1=new Thread(lt);
        Thread t2=new Thread(nt);

        t1.start();
        t2.start();
    }
}