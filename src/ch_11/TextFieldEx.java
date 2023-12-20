package ch_11;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
    public TextFieldEx(){
        setTitle("TextField Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Name"));
        c.add(new JTextField(20));
        c.add(new JLabel("major"));
        c.add(new JTextField("Computer dev", 20));
        c.add(new JLabel("address"));
        c.add(new JTextField("South Korea ...", 20));

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldEx();
    }
}
