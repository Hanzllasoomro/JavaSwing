import javax.swing.*;
import java.awt.*;

public class Swing45 extends JFrame {
    public static void main(String[] args) { new Swing45(); }
    JDesktopPane dp;
    Swing45(){

        setTitle("JDesktopPane");
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        dp = new JDesktopPane();
        display(dp);
        add(dp, BorderLayout.CENTER);


        setVisible(true);
        validate();
    }
    void display(JDesktopPane dp){
        int numFrame = 3 , x =3 , y =30;
        for(int i = 0; i<numFrame;i++){
            JInternalFrame iframe = new JInternalFrame("new window"+i+1,true, true, true,true);
            iframe.setBounds(x,y,250,100);
            iframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            iframe.add( new JLabel("display window"));
            iframe.setVisible(true);

            dp.add(iframe);
            y+=100;
        }
    }
}
