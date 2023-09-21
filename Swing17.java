import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static java.awt.Font.*;

public class Swing17 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Key event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,600,500);
        frame.setVisible(true);
    }
    static class MyFrame extends JFrame implements MouseListener {

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
            label.addMouseListener(this);

            c.add(label);
            c.add(ta);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            ta.setText(ta.getText()+"\n Mouse is clicked");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            ta.setText(ta.getText()+"\n Mouse is entered");

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            ta.setText(ta.getText()+"\n Mouse is released");

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            ta.setText(ta.getText()+"\n Mouse is entered");

        }

        @Override
        public void mouseExited(MouseEvent e) {
            ta.setText(ta.getText()+"\n Mouse is exit");

        }
    }
}
