import javax.swing.*;
import java.awt.*;

public class Swing57 extends JComponent {
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(110,10,200,200);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("JComponent");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Swing57 swing = new Swing57();
        frame.getContentPane().add(swing);
    }
}
