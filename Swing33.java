import javax.swing.*;
import java.awt.*;

public class Swing33 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JScrollPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,500,300);
        frame.setLayout(new FlowLayout());


        JTextArea ta = new JTextArea(JFrame.ABORT,JFrame.ABORT);

        JScrollPane sp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED ,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED ); //

        frame.add(sp);
        frame.setVisible(true);
    }
}
