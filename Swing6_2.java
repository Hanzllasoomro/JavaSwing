import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing6_2 {
    public static void main(String[] args) {

        Swing6_2.Myframe frame = new Swing6_2.Myframe();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Action Demo");
        frame.setBounds(100,100,800,500);

        frame.setVisible(true);
    }

    static class Myframe extends JFrame implements ActionListener {
        Container c;
        JButton b1 = new JButton("button 1");
        JButton b2= new JButton("button 2");
        JButton b3= new JButton("button 3");

        Myframe(){
            c = this.getContentPane();
            c.setLayout(null);

            b1.setBounds(150,100,100,20);
            b2.setBounds(350,100,100,20);
            b3.setBounds(550,100,100,20);

            c.add(b1);
            c.add(b2);
            c.add(b3);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b1)
                c.setBackground(Color.cyan);
            if(e.getSource() == b2)
                c.setBackground(Color.ORANGE);
            if(e.getSource() == b3)
                c.setBackground(Color.magenta);
        }
    }
}
