import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Static List creation example

public class Swing51 extends JFrame {
    public static void main(String[] args) { new Swing51();}
    Swing51() {

        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JList list = new JList(items);
        list.setVisibleRowCount(5);

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list));
        add(panel);

        JLabel label = new JLabel();
        revalidate();
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2) {
                    int index = list.getSelectedIndex();
                    String item = String.valueOf(list.getSelectedIndex());
                    label.setText("Selected item is " + item + "and selected index" + index);

                }
            }
        });
        panel.add(label);
    }
    String[] items = {"item0","item1","item2","item3","item4","item5","item6","item7","item8"};
}