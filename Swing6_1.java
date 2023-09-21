import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing6_1 {
    public static void main(String[] args) {

        Myframe frame = new Myframe();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Action Demo");
        frame.setBounds(100,100,700,500);




        frame.setVisible(true);
    }

   static class Myframe extends JFrame implements ActionListener {
        Container c;
        JButton b;
        Myframe(){
            c = this.getContentPane();
            c.setLayout(null);

            b= new JButton("Click me");
            b.setBounds(100,100,100,20);

            b.addActionListener(this);
            c.add(b);
        }

       @Override
       public void actionPerformed(ActionEvent e) {
            c.setBackground(Color.YELLOW);
       }
   }
}
