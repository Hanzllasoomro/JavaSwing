import javax.swing.*;
import java.awt.*;

public class Swing4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c = frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass  = new JPasswordField(); //
        pass.setBounds(100,50,120,30);
        pass.setText("123456");
        pass.setFont(new Font("",Font.BOLD,29));
        pass.setEchoChar('*');
        pass.setEchoChar((char)0);

        c.add(pass);
        frame.setVisible(true);
    }
}
