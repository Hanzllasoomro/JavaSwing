import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Swing25 extends JFrame {

    JButton b = new JButton("1 extra text");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    public  Swing25(){

        setBounds(10, 10, 1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();

       // FlowLayout layout = new FlowLayout(FlowLayout.LEFT,10,20);
        FlowLayout layout = new FlowLayout();

        c.setLayout(layout);

        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5,0);
    }
    public static void main(String[] args) {

        new Swing25();
    }
}
