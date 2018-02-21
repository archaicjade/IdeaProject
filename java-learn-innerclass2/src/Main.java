
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Outer2 outer2 = new Outer2();

        outer2.print();


        class TimerPrinter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Time is " + new Date() + " now.");
            }
        }

        ActionListener listener = new TimerPrinter();
        Timer t = new Timer(1000, listener);

        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);


    }
}

