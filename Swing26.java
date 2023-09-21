import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Swing26 extends JFrame {

    JButton b = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    public  Swing26(){

        setBounds(10, 10, 1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();


        GridLayout layout = new GridLayout(3,2,10,20);
        /*layout.setVgap(10);
        layout.setHgap(20);*/

        c.setLayout(layout);

        c.add(b);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5,0);
    }
    public static void main(String[] args) {

        new Swing26();
    }
}
