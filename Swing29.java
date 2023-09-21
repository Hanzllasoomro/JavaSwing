import javax.swing.*;
import java.awt.*;

public class Swing29 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,300);

        Container c = frame.getContentPane();
        CardLayout cardLayout = new CardLayout();
        c.setLayout(cardLayout);


        JButton b = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        c.add(b,"1");
        c.add(b2,"2");
        c.add(b3,"3");
        c.add(b4,"4");
        c.add(b5,"5");

        cardLayout.next(c);
        cardLayout.previous(c);
        cardLayout.first(c);
        cardLayout.last(c);

        cardLayout.show(c,"3");

        c.setLayout(cardLayout);
    }
}
