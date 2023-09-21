import javax.swing.*;
import java.awt.*;

public class Swing7 {
    public static Container c;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,20,1000,500);

        c= frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);

        JTextArea t1 = new JTextArea();
        t1.setBounds(0,0,frame.getWidth(),frame.getHeight());
        t1.setText("Hanzlla soomro");
        t1.setFont(new Font("Arial",Font.BOLD,32));
        t1.setBackground(Color.PINK);
        t1.setLineWrap(true);

        c.add(t1);
        frame.setVisible(true);
    }
}
