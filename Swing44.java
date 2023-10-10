import javax.swing.*;
import java.awt.*;

public class Swing44 extends JFrame {
    public static void main(String[] args) { new Swing44(); }

    JInternalFrame iframe;
    Swing44(){

        setTitle("JInternalFrame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(null);
        setLocationRelativeTo(null);

        iframe = new JInternalFrame("JinternalFrame2",true,true ,true,true);
        initframe(iframe);
        add(iframe);


        setVisible(true);
        validate();
    }

    private void initframe(JInternalFrame iframe) {
        iframe.setSize(300,300);
        iframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        iframe.setLocation(50,50);
        iframe.setVisible(true);
        iframe.setLayout(new FlowLayout());

        iframe.add(new JButton("MyButton"));
    }
}
