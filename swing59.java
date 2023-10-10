import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing59 {
    public static void main(String[] args) {

        JFrame frame =new JFrame("JViewPoint");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        ImageIcon image = new ImageIcon("C:\\Users\\HP\\OneDrive\\Pictures\\uwp3855758.jpeg");

        JLabel label = new JLabel(image);

        JScrollPane scrollPane = new JScrollPane(label);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setViewportBorder(BorderFactory.createLineBorder(Color.MAGENTA));

        JViewport viewport = scrollPane.getViewport();

        JButton up = new JButton("up");
        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point current = viewport.getViewPosition();
                current = new Point(current.x,current.y-100);
                viewport.setViewPosition(current);
            }
        });
        JButton down = new JButton("down");
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point current = viewport.getViewPosition();
                current = new Point(current.x,current.y+100);
                viewport.setViewPosition(current);
            }
        });
        JButton right = new JButton("right");
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point current = viewport.getViewPosition();
                current = new Point(current.x+100,current.y);
                viewport.setViewPosition(current);
            }
        });
        JButton left = new JButton("left");
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point current = viewport.getViewPosition();
                current = new Point(current.x-100,current.y);
                viewport.setViewPosition(current);
            }
        });

        JPanel panel = new JPanel();
        panel.add(up);
        panel.add(down);
        panel.add(right);
        panel.add(left);

        frame.add(scrollPane);
        frame.add(panel, BorderLayout.NORTH);
        frame.setVisible(true);
    }
}
