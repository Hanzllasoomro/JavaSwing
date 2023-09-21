import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class Swing27 extends JFrame {

    JButton b = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    public  Swing27(){

        setBounds(10, 10, 1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container c = getContentPane();


        GridBagLayout layout = new GridBagLayout();
        c.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.fill= GridBagConstraints.HORIZONTAL;
        c.add(b,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0;
        c.add(b2,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        c.add(b3,gbc);

        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 40;
        c.add(b4,gbc);

        gbc.gridwidth = 2;
        gbc.ipady=0;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.weighty=1;
        c.add(b5,gbc);

        pack();
    }
    public static void main(String[] args) {

        new Swing27();
    }
}
