package chapter6.callback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.time.Instant;


public class TimerTest {
    public static void repeat(String text,int delay){
        ActionListener listener = event->{
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay,listener).start();
    }
    public void set(){
        String test = "a";
    }

    public static void main(String[] args)
    {
        repeat("hello,can you hear me?",1000);
//        TimePrinter listener = new Time Printer();
//        //构造一个定时器，每隔1秒通知一次listener，动作监视对象listener就是定时器回调的对象
//        Timer timer = new Timer(1000,listener);
//        Timer timer = new Timer(1000,System.out::println);
//        timer.start();
//        System.out.println("haha");
//        //显示对话框
//        JOptionPane.showMessageDialog(null,"quit program?");
//        System.exit(0);

    }

}
