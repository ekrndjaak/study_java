package ch_11;

import ch_9.FlowLayoutEx;

import javax.swing.*;
import java.awt.*;

public class ComboBoxEx extends JFrame {
    private String [] fruits = {"apple", "banana", "kiwi", "mango", "pear"};
    private String [] names = {"kim", "kang", "Moon","choi"};
    public ComboBoxEx(){
        setTitle("ComboBox example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JComboBox<String> strCombo = new JComboBox<String>(fruits);
        c.add(strCombo);

        JComboBox<String> nameCombo = new JComboBox<String>();
        for(int i=0;i<names.length;i++){
            nameCombo.addItem(names[i]);
            c.add(nameCombo);
        }
        setSize(300,300 );
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxEx();
    }
}
