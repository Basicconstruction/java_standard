package chapter8_usual;

public class Consumer extends Thread{    //消费者线程类
    private Buffer br;		//用于暂存产品的共享变量
    public Consumer(Buffer br) {	//指定缓冲区
        this.br =br;
    }
    public void run(){
        for(int i=1;i<=5;i++){//连续从缓冲区取出产品
            synchronized(br) {
                char ch=br.get();
                if(ch!='\0') {
                    System.out.println("消费者"+i+"消费了产品："+ch);
                }
                else{
                    System.out.println("消费者"+i+"没有产品可以消费！");
                }
            }
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Buffer br=new Buffer();
        Procedure p=new Procedure(br);
        Consumer c=new Consumer(br);
        p.start();
        c.start();
    }
}



