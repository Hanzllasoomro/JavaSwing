import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Font.*;

public class Swing20 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Caret Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 500);
        frame.setVisible(true);
    }

    static class MyFrame extends JFrame implements CaretListener {

        JTextField t1;
        JTextArea ta;

        MyFrame() {

            Container c = getContentPane();
            c.setLayout(null);

            t1 = new JTextField();
            t1.setFont(new Font("", Font.BOLD, 18));
            t1.setBounds(50, 100, 100, 30);
            t1.addCaretListener(this);

            ta = new JTextArea();
            ta.setBounds(190,10,300,250);

            c.add(t1);
            c.add(ta);

        }
            @Override
            public void caretUpdate (CaretEvent e){
                ta.setText(ta.getText()+"\n Caret Updated"+e.getDot()+"||"+e.getMark());
            }
    }
}