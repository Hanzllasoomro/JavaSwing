import javax.swing.*;
import java.awt.*;

public class Swing42 extends JFrame {

    JLabel label;
    JPasswordField pf;

    static String str = "<html>" +
            "<div bgcolor='#80080' color='#ffffff'>"+
            "Enter your Passowrd<br/>" +
            "Password should be 8 character long"+
            "/div"+
            "</html>";
    Swing42(){
         setTitle("JToolTip");
         setSize(400,400);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setLayout(null);
         setLocationRelativeTo(null);


         label = new JLabel("Password");
         label.setBounds(50,100,80,30);
         add(label);

         pf = new JPasswordField();
         pf.setBounds(140,100,100,30);
         add(pf);

         pf.setToolTipText(str);

         setVisible(true);
         validate();
     }

    public static void main(String[] args) {new Swing42();}
}
