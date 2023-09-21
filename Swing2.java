import javax.swing.*;
import java.awt.*;

class Swing2{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// to close window with the program termination
        frame.setBounds(100,100,1000,500); // sum of setSize and setLocation
        Container c = frame.getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("userName"); //
        label.setBounds(100,50,200,31);

//        Font font = new Font("Arial",Font.ITALIC,32);
        label.setFont(new Font("",Font.BOLD,32));
        label.setForeground(Color.GREEN);
        c.setBackground(Color.BLACK);

        ImageIcon icon = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\KONAMI\\PRO EVOLUTION SOCCER 2019\\WEPES\\Team\\ita\\emblem\\ITA_Juventus.png");
        JLabel label2 = new JLabel(icon);
        label2.setBounds(300,50,icon.getIconWidth(),icon.getIconHeight());

        JLabel label3 = new JLabel("Text",icon, JLabel.LEFT);
        label3.setBounds(100,500,icon.getIconWidth(),icon.getIconHeight());

        JLabel label4 = new JLabel("image");
        label4.setIcon(icon);

        c.add(label);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        frame.setVisible(true); // to make window visible

    }

}