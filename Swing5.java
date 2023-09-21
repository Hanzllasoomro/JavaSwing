import javax.swing.*;
import java.awt.*;

public class Swing5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 60mins.online || hesgoal tv || Livesoccertc
        frame.setBounds(100,100,1000,500);  // GHD Sports app
        Container c = frame.getContentPane();
        c.setLayout(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\KONAMI\\PRO EVOLUTION SOCCER 2019\\WEPES\\Team\\ita\\emblem\\ITA_Juventus.png");

        JButton button = new JButton(icon);
        button.setSize(icon.getIconWidth(),icon.getIconHeight());
        button.setLocation(20,10);
        button.setFont(new Font("",Font.PLAIN,20));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBackground(Color.BLACK);

        c.add(button);
        frame.setVisible(true);
    }
}
