package ch_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

public class KeyListenerEx extends JFrame {
    private JLabel [] keyMessage;
    public KeyListenerEx() {
        setTitle("KeyListener example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.addKeyListener(new MyKeyListener());
        
        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel("getKeyCode()");
        keyMessage[1] = new JLabel("getKeychar()");
        keyMessage[2] = new JLabel("getKeyText()");
        
        for(int i=0; i<keyMessage.length;i++){
            c.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);  // 컴포넌트의 바탕색이 보이도록 하기위해 컴포넌트가 불투명하기 지정될 필요 있다.
            keyMessage[i].setBackground(Color.YELLOW);
        }
        setSize(300,150);
        setVisible(true);
        
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter{
        public void keyPressed(keyEvent e) {
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();
            
            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(e.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
