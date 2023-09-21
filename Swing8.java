import javax.swing.*;
import java.awt.*;

public class Swing8 {
    public static Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,20,1000,500);

        c= frame.getContentPane();
        c.setLayout(null);

        JRadioButton rb = new JRadioButton("Male");
        rb.setBounds(100,50,100,20);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(300,50,100,20);

        ButtonGroup gender = new ButtonGroup();
        gender.add(rb);
        gender.add(rb2);

        c.add(rb);
        c.add(rb2);
        frame.setVisible(true);
    }
}
