package chapter8_usual;

public class Buffer2 {
    private char chBuffer;//共享缓冲区
    private boolean empty=true;  //chBuffer是否为空的信号量
    public synchronized void put(char ch) {
        while(!empty)	{	//当缓冲区满的时候，等待
            try {
                wait();	//阻塞自己
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chBuffer=ch;	   //将生产出的产品放到缓冲区
        empty=false;	  //设置缓冲区满状态
        notify();	  //唤醒其他等待线程
    }
    public synchronized char get(){   //从缓冲区取出产品
        while(empty)  {	//当缓冲区空的时候，等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        char chr=chBuffer;
        chBuffer='\0';
        empty=true;		//设置缓冲区空状态
        notify();
        return chr;		//返回取出的产品
    }
}

