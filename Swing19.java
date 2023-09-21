import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Font.*;

public class Swing19 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Key event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,600,500);
        frame.setVisible(true);
    }
    static class MyFrame extends JFrame implements FocusListener {

        JTextField t1;
        JTextArea ta;
        MyFrame(){

            Container c = getContentPane();
            c.setLayout(null);

            t1 = new JTextField();
            t1.setFont(new Font("",Font.BOLD,18));
            t1.setBounds(50,100,100,30);

            ta = new JTextArea();
            ta.setBounds(200,50,300,300);
            t1.addFocusListener(this);

            c.add(t1);
            c.add(ta);
        }

        @Override
        public void focusGained(FocusEvent e) {
            ta.setText(ta.getText()+"\n Focus gained");
        }

        @Override
        public void focusLost(FocusEvent e) {
            ta.setText(ta.getText()+"\n Focus lost");
        }
    }
}
