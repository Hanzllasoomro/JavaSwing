import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing56 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Color Chooser");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c = frame.getContentPane();
        c.setLayout(new GridBagLayout());

        JButton button1 = new JButton("Change Color");
        c.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Select a color", Color.RED);
                c.setBackground(color);
            }
        });


        frame.revalidate();
    }
}
