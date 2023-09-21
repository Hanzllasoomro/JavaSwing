import org.apache.commons.lang3.JavaVersionTest;

import javax.swing.*;
import java.awt.*;

public class Swing3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// 60mins.online || hesgoal tv || Livesoccertc
        frame.setBounds(100,100,1000,500);  // GHD Sports app
        Container c = frame.getContentPane();
        c.setLayout(null);

        Font f1 = new Font("",Font.HANGING_BASELINE,18);

        JTextField t1 = new JTextField(); //
        t1.setBounds(100,20,100,19);
        t1.setText("User name");
        t1.setFont(f1);
        t1.setBackground(Color.PINK);
        t1.setForeground(Color.BLUE);
        t1.setEditable(false);

        c.add(t1);
        frame.setVisible(true);
    }
}
