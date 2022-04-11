package fade.pack;

import javax.swing.*;
import java.awt.*;

public class Okno3 extends JFrame {

    public Okno3(){

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton b1 = new JButton("PageStart");
        JButton b2 = new JButton("PageEnd");
        JButton b3 = new JButton("LineStat");
        JButton b4 = new JButton("LineEnd");
        JButton b5 = new JButton("Center");

        JPanel panelPageStart = new JPanel();
        panelPageStart.setLayout(new FlowLayout());
        panelPageStart.add(b1);
        panelPageStart.add(new JButton("aaa"));
        panelPageStart.add(new JButton("333"));

        add(b1, BorderLayout.PAGE_START);
        add(b2, BorderLayout.PAGE_END);
        add(b3, BorderLayout.LINE_START);
        add(b4, BorderLayout.LINE_END);
        add(b5, BorderLayout.CENTER);




        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
