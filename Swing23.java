import javax.swing.*;
import java.awt.*;

public class Swing23 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Null Layout");
        frame.setBounds(10,10,1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c = frame.getContentPane();
        c.setLayout(null); // main point

        JButton b = new JButton("button 1");
        JButton b2 = new JButton("button 2");
        JButton b3 = new JButton("button 3");
        JButton b4 = new JButton("button 4");
        JButton b5 = new JButton("button 5");

        b.setBounds(20,20,80,30);
        b2.setBounds(120,20,80,30);
        b3.setBounds(220,20,80,30);
        b4.setBounds(20,100,80,30);
        b5.setBounds(120,100,80,30);

        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);

    }
}
