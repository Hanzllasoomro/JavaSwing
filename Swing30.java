import javax.swing.*;
import java.awt.*;

public class Swing30 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,300);

        Container c = frame.getContentPane();
        BoxLayout boxLayout = new BoxLayout(c,BoxLayout.X_AXIS);
        c.setLayout(boxLayout);

        JButton button = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button2.setAlignmentX(Component.LEFT_ALIGNMENT);
        button3.setAlignmentX(Component.LEFT_ALIGNMENT);
        button4.setAlignmentX(Component.LEFT_ALIGNMENT);

        c.add(button);
        c.add(Box.createRigidArea(new Dimension(80,0)));
        c.add(button2);
        c.add(button3);
        c.add(button4);

    }
}
