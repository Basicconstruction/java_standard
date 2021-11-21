package chapter8_usual;

public class Buffer {
    private char chBuffer;//共享缓冲区
    public synchronized void put(char ch)	{
        chBuffer=ch;//将生产出的产品放到缓冲区
    }
    public synchronized char get(){   //从缓冲区取出产品
        char chr=chBuffer;
        chBuffer='\0';
        return chr;
    }
}
