package chapter8_usual;

import java.util.Random;
public class Procedure extends Thread{     //生产者线程类
    private Buffer br;		 //用于暂存产品的共享变量
    Random r=new Random();
    public Procedure(Buffer br) {	//指定缓冲区
        this.br=br;
    }
    public void run(){
        for(int i=1;i<=5;i++){//连续向缓冲区放入产品
            char ch=(char)(65+r.nextInt(20));
            br.put(ch);
            System.out.println("生产者"+i+"生产了产品："+ch);
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


