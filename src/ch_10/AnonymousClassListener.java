package ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassListener extends JFrame {
    public AnonymousClassListener(){
        setTitle("Action Event Listener tester");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("action");
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action"))
                    b.setText("액션");
                else b.setText("Action");
                setTitle(b.getText());
            }
        });
        setSize(350, 150);
        setVisible(true);
        }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
    }
