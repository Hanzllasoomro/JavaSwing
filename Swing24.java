import javax.swing.*;
import java.awt.*;

public class Swing24 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Null Layout");
        frame.setBounds(10, 10, 1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c = frame.getContentPane();

        BorderLayout layout = new BorderLayout(10,10);

      /*  layout.setHgap(10);
        layout.setVgap(10);*/
        c.setLayout(layout);

        JButton b = new JButton("Page Start");
        JButton b2 = new JButton("Page End");
        JButton b3 = new JButton("Line Start");
        JButton b4 = new JButton("Center");
        JButton b5 = new JButton("Line End");

        c.add(b, BorderLayout.PAGE_START);
        c.add(b2, BorderLayout.PAGE_END);
        c.add(b3, BorderLayout.LINE_START);
        c.add(b4, BorderLayout.CENTER);
        c.add(b5, BorderLayout.LINE_END);
    }
}