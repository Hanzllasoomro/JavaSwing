import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Font.*;

public class Swing21 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Caret Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 500);
        frame.setVisible(true);
    }

    static class MyFrame extends JFrame implements WindowListener {

        JTextField t1;
        JTextArea ta;

        MyFrame() {
            addWindowListener(this);
        }


        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Window is Opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Window is Closing");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("Window is Closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Window is iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("Window is De-Iconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("Window is Activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("Window is De-activated");
        }
    }
}