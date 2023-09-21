import javax.swing.*;
import java.awt.*;
import java.lang.module.Configuration;

public class Swing9 {
    static Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,20,1000,500);

        c= frame.getContentPane();
        c.setLayout(null);

        JCheckBox cb = new JCheckBox("matriculation");
        JCheckBox cb2 = new JCheckBox("Intermediate");
        JCheckBox cb3 = new JCheckBox("Graduation");
        JCheckBox cb4 = new JCheckBox("Post-graduation");


        cb.setBounds(100,50,120,20);
        cb2.setBounds(260,50,120,20);
        cb3.setBounds(420,50,120,20);
        cb4.setBounds(580,50,120,20);

        c.add(cb);
        c.add(cb2);
        c.add(cb3);
        c.add(cb4);

                frame.setVisible(true);
    }
}
