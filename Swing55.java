import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class Swing55 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GlassPane");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("HANLLA SOOMRO");
        JButton button1 = new JButton("Hide");
        JButton button2 = new JButton("Show");
        JButton button3 = new JButton("Hide");


        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setGlassPane(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(20, 40, 0, 150));
                g.fillRect(0,0,getWidth(), getHeight());
            }
        });

        final Container glassPane = (Container) frame.getGlassPane();
        glassPane.setLayout(new GridBagLayout());
        glassPane.addMouseListener(new MouseAdapter() {});
        glassPane.add(button3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(!label.isVisible());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glassPane.setVisible(true);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glassPane.setVisible(false);
            }
        });

        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
    }
}
