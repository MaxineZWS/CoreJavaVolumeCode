package chapter6.InnerClass;

import javax.swing.*;

/**
 * This program demonstrates the  use of inner classes
 */
public class InnerClassTest {
    public static void main(String[] args){
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        //clock is running untill the user selects "OK"
        JOptionPane.showMessageDialog(null,"quit program?");
        System.exit(0);
    }

}
