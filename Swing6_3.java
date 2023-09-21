import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing6_3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Action Demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,20,1000,500);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JButton b1 = new JButton("click me");
        b1.setBounds(100,50,100,25);
        c.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.cyan);
            }
        });
    }
}
