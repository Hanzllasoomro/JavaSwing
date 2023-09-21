import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing6_4 {
    public static Container c;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Action Demo");
        frame.setBounds(10,20,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        c= frame.getContentPane();
        c.setLayout(null);

        JButton red = new JButton("RED");
        JButton yellow = new JButton("YELLOW");
        JButton green = new JButton("GREEN");

        red.setBounds(20,100,100,25);
        yellow.setBounds(180,100,100,25);
        green.setBounds(340,100,100,25);

        red.addActionListener(new Red());
        yellow.addActionListener(new Yellow());
        green.addActionListener(new Green());

        c.add(red);
        c.add(yellow);
        c.add(green);
    }
    static class Red implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Swing6_4.c.setBackground(Color.RED);
        }
    }
    static class Yellow implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Swing6_4.c.setBackground(Color.YELLOW);
        }
    }
    static class Green implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Swing6_4.c.setBackground(Color.GREEN);
        }
    }
}
