package chapter6.InnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * A clock that prints the time in regular intervals.
 */
public class TalkingClock {
    private int intervals;
    private boolean beep;

    /**
     * Construct a talking clock
     * @param intervals the interval between messages
     * @param beep true if the clock should beep
     */
    public TalkingClock(int intervals,boolean beep){
        this.intervals = intervals;
        this.beep = beep;
    }

    /**
     * Starts to clock
     */
    public void start(){
        ActionListener listener = new TimePrinter();
        new Timer(intervals,listener).start();
    }

    public class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) { //ActionEvent提供了事件的相关信息，包括时间，重写接口定义定时器到时的操作
            //1.打印当前时间
            System.out.println("准点报时，此时的时间为："+ Instant.ofEpochMilli(e.getWhen()));
            //2.响铃
            if(beep) Toolkit.getDefaultToolkit().beep();//getDefaultToolkit获得默认的工具箱，beep发生一声铃响
        }
    }

}
