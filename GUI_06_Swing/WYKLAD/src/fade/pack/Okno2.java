package fade.pack;

import javax.swing.*;
import java.awt.*;

public class Okno2 extends JFrame {

    public Okno2(){

        JTextArea jTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(jTextArea);

        String rodzajPisama = Font.SERIF;
        int rozmiarPisma = 24;
        int typPisma = Font.BOLD | Font.ITALIC;

        Font f = new Font(rodzajPisama,typPisma,rozmiarPisma);
        jTextArea.setFont(f);

        jTextArea.setForeground(Color.cyan);
        jTextArea.setBackground(Color.black);

        add(scrollPane);

        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
