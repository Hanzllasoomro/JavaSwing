import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing32_2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Card Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,300);
        frame.setLayout(new FlowLayout());

        Container c = frame.getContentPane();

        JButton button1 = new JButton("plain");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"this is a plain message","message",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        frame.add(button1);

        JButton button2 = new JButton("info");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {JOptionPane.showMessageDialog(frame,
                    "this is a info message","message",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        frame.add(button2);

        JButton button3 = new JButton("Question");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"this is a Question message","message",
                        JOptionPane.QUESTION_MESSAGE);
            }
        });
        frame.add(button3);

        JButton button4 = new JButton("Error");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"this is a error message","message",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        frame.add(button4);

        JButton button5 = new JButton("warning");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,"this is a warning message","message",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        frame.add(button5);
    }
}
