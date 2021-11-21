package chapter8_usual;

import javax.swing.*;
import java.awt.*;

public class BackTimer extends JFrame {
    volatile int iok = 5;
    volatile JButton j1;
    public BackTimer(){
        super("倒计时");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLayout(new BorderLayout());
        JLabel jLabel = new JLabel(iok+"",JLabel.CENTER);
        jLabel.setFont(new Font("微软雅黑",Font.BOLD,40));
        this.getContentPane().add(jLabel,BorderLayout.CENTER);
        j1 = new JButton("start");
        this.getContentPane().add(j1,BorderLayout.NORTH);
        jLabel.setSize(100,100);
        j1.setSize(100,40);
        j1.addActionListener(e->{
            Thread thread = new Thread(()->{
                synchronized (BackTimer.this){
                    BackTimer.this.j1.setEnabled(false);
                    BackTimer.this.j1.setText("working");
                    BackTimer.this.iok = 5;
                    while(BackTimer.this.iok>0){
                        try {
                            jLabel.setText(BackTimer.this.iok+"");
                            Thread.sleep(1000);
                            BackTimer.this.iok--;
                            jLabel.setText(BackTimer.this.iok+"");

                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                    BackTimer.this.j1.setEnabled(true);
                    BackTimer.this.j1.setText("start");
                }
            });
            thread.start();
        });
    }

    public static void main(String[] args) {
        BackTimer timer = new BackTimer();
        timer.setVisible(true);
    }
}
