import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing10 {
    static Container c;
    static String[] values = {"a","b","c","d","f"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 20, 1000, 500);

        c = frame.getContentPane();
        c.setLayout(null);

        JComboBox cb = new JComboBox(values);
        cb.setBounds(100,100,100,30);
        c.add(cb);
        cb.setSelectedItem("d");

        JComboBox cb2 = new JComboBox(values);
        cb2.setBounds(250,100,100,30);
        c.add(cb2);
        cb2.setSelectedIndex(2);
        cb2.addItem("HANZLLA");
        cb2.removeItem("b");

        JButton b = new JButton("ok");
        b.setBounds(150,250,100,30);
        c.add(b);

        JLabel l = new JLabel("");
        l.setBounds(220,100,100,30);
        c.add(l);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String item = (String) cb.getSelectedItem();
                l.setText(item);
            }
        });

        frame.setVisible(true);
    }
}
