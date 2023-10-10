import javax.swing.*;
import java.awt.*;

public class Swing54 extends JFrame {
    public static void main(String[] args) {
        Swing54 frame = new Swing54();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    Swing54() {

        JLayeredPane pane = this.getLayeredPane();
        button1 = new JButton("red");
        button1.setBackground(Color.red);
        button1.setBounds(20, 20, 50, 50);

        button2 = new JButton("green");
        button2.setBackground(Color.green);
        button2.setBounds(40, 40, 50, 50);

        button3 = new JButton("blue");
        button3.setBackground(Color.blue);
        button3.setBounds(60, 60, 50, 50);

        pane.add(button1, new Integer(10));
        pane.add(button2, new Integer(20));
        pane.add(button3, new Integer(30));

    }

    JButton button1, button2, button3;
}
