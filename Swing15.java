import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing15 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("ItemEvent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 500);
        frame.setVisible(true);
    }

    static class MyFrame extends JFrame implements ItemListener {

        JComboBox cb;
        JTextArea ta;
        public MyFrame() {

            Container c = getContentPane();
            c.setLayout(null);

            String[] values = {"A", "B", "C", "D"};
            cb = new JComboBox(values);
            cb.setBounds(50, 50, 100, 30);
            c.add(cb);
            cb.addItemListener(this);

            ta = new JTextArea();
            ta.setBounds(200,50,100,100);
            c.add(ta);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {

            ta.setText(cb.getSelectedItem().toString());
        }
    }
}


