package ch_14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Dialog_6 extends JDialog{
    private JLabel label = new JLabel("두 수를 더합니다.");
    private JTextField textField1 = new JTextField(10);
    private JTextField textField2 = new JTextField(10);
    private JButton btn = new JButton("Add");
    public Dialog_6(JFrame frame, String title){
        super(frame, title, true);  // ModalDialog
        this.setLayout(null);
        this.add(label);
        this.add(textField1);
        this.add(textField2);
        this.add(btn);

        label.setBounds(45, 10, 100, 20);
        textField1.setBounds(45, 50, 100, 20);
        textField2.setBounds(45, 90, 100, 20);
        btn.setBounds(45, 130, 100, 20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setSize(200, 200);
    }
    public String calcResult(){
        String result;
        if(textField1.getText().length() == 0 || textField2.getText().length() == 0){
            result = "계산 결과 출력";
        }
        else{
            result = Integer.toString(Integer.parseInt(textField1.getText()) + Integer.parseInt(textField1.getText()));
        }
        textField1.setText("");
        textField2.setText("");
        return result;
    }
}
public class Task extends JFrame{
    private Dialog_6 dialog;
    private JButton calculateBtn;
    private JLabel resultLabel;
    public Task(){
        super("다이얼로그 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        dialog = new Dialog_6(this, "Calculation Dialog");
        calculateBtn = new JButton("calculate");
        resultLabel = new JLabel("계산 결과 출력");
        resultLabel.setOpaque(true); // 이거 없으면 바탕색이 안보인다.
        resultLabel.setBackground(Color.GREEN);

        calculateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(true);

                String result = dialog.calcResult();
                resultLabel.setText(result);
            }
        });
        container.add(calculateBtn);
        container.add(resultLabel);

        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args){
        new Task();
    }
}