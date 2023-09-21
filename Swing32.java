import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing32 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,300);
        frame.setLayout(new FlowLayout());

        Container c = frame.getContentPane();

        JButton button = new JButton("Click me");


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String str = JOptionPane.showInputDialog("Enter your name");
                if(str.length()>0)
                    System.out.println("the name of user is :"+str);
            }
        });
        frame.add(button);
    }
}
