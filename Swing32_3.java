import javax.crypto.spec.OAEPParameterSpec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;

public class Swing32_3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,300);
        frame.setLayout(new FlowLayout());

        Container c = frame.getContentPane();

        JButton button1 = new JButton("Exit");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selection = JOptionPane.showConfirmDialog(frame,"Do you want to exit","message",
                        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(selection == JOptionPane.YES_OPTION){
                    System.out.println("Yes option is selected");
                System.exit(0);
                }
            }
        });
        frame.add(button1);
    }
}
