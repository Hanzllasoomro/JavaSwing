import javax.swing.*;
import java.awt.*;

public class Swing28 extends JFrame{
    public Swing28(){
        setBounds(10, 10, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0,0,300,300);
        panel.setBackground(Color.YELLOW);
        c.add(panel);
        panel.setLayout(null);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0,0,200,200);
        panel2.setBackground(Color.RED);
        c.add(panel2);

        JButton button = new JButton("button");
        panel2.add(button);
        panel.add(panel2);
    }
    public static void main(String[] args) {

        new Swing28();
    }
}
