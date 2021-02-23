package chapter6.callback;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
//定时器需要传入一个实现了动作监视器接口的类的对象
public class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { //ActionEvent提供了事件的相关信息，包括时间，重写接口定义定时器到时的操作
        //定时1.打印当前时间
        System.out.println("准点报时，此时的时间为："+ Instant.ofEpochMilli(e.getWhen()));
        //定时2.响铃
        Toolkit.getDefaultToolkit().beep();//getDefaultToolkit获得默认的工具箱，beep发生一声铃响
    }
}
