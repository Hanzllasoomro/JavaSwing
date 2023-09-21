import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Font.*;

public class Swing18 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Key event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,600,500);
        frame.setVisible(true);
    }
    static class MyFrame extends JFrame implements MouseMotionListener {

        JLabel label;
        JTextArea ta;
        MyFrame(){

            Container c = getContentPane();
            c.setLayout(null);

            label = new JLabel("My Label");
            label.setFont(new Font("",Font.BOLD,18));
            label.setBounds(50,100,100,30);

            ta = new JTextArea();
            ta.setBounds(200,50,300,300);
            label.addMouseMotionListener(this);

            c.add(label);
            c.add(ta);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
                ta.setText(ta.getText()+"\n mouse dragged");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            ta.setText(ta.getText()+"\n mouse moved");
        }
    }
}
