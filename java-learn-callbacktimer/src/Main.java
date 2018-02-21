import com.bai.java.learn.TimerPrinter;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        ActionListener ac = new TimerPrinter();

        Timer t = new Timer(1000, ac);

        t.start();

        JOptionPane.showMessageDialog(null, "Quit progarm?");
        System.exit(0);

    }
}

