import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Swing16 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Key event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,400,400);
        frame.setVisible(true);
    }
    static class MyFrame extends JFrame implements KeyListener {

        JTextArea ta;
        MyFrame(){

            Container c = getContentPane();
            c.setLayout(null);

            ta = new JTextArea();
            ta.setBounds(10,10,365,350);
            ta.addKeyListener(this);

            c.add(ta);
        }

        @Override
        public void keyTyped(KeyEvent e) {

            ta.setText(ta.getText()+"\n"+"typing : "+e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {

            ta.setText(ta.getText()+"\n"+"pressed : "+e.getKeyChar());
        }

        @Override
        public void keyReleased(KeyEvent e) {

            ta.setText(ta.getText()+"\n"+"released : "+e.getKeyChar());
        }
    }
}
