package chapter8_usual;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandChoose extends JFrame {
    volatile int iok = 5;
    volatile boolean go = false;
    Random r = new Random();
    public RandChoose(){
        super("随机数");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(new BorderLayout());
        JLabel jLabel = new JLabel(iok+"",JLabel.CENTER);
        jLabel.setFont(new Font("微软雅黑",Font.BOLD,40));
        this.getContentPane().add(jLabel,BorderLayout.CENTER);
        JButton j1 = new JButton("start");
        this.getContentPane().add(j1,BorderLayout.NORTH);
        jLabel.setSize(100,100);
        j1.setSize(100,40);
        j1.addActionListener(e->{
            Thread thread = new Thread(()->{
                if(j1.getText().equals("start")){
                    j1.setText("end");
                    synchronized (RandChoose.this){
                        RandChoose.this.iok = 100;
                        go = true;
                        while(go){
                            try {
                                Thread.sleep(30);
                                RandChoose.this.iok = r.nextInt(100);
                                jLabel.setText(RandChoose.this.iok+"");

                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }else{
                    j1.setText("start");
                    go = false;
                }
            });
            thread.start();
        });
    }

    public static void main(String[] args) {
        RandChoose timer = new RandChoose();
        timer.setVisible(true);
    }
}
