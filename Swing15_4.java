import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing15_4{
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("ItemEvent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 500);
        frame.setVisible(true);
    }

    static class MyFrame extends JFrame implements ItemListener {

        JMenuBar menubar;
        JMenu menu;
        JCheckBoxMenuItem c1;
        JTextArea ta;
        public MyFrame() {

            Container c = getContentPane();
            c.setLayout(null);

            menubar = new JMenuBar();
            menu = new JMenu("File");
            menubar.add(menu);

            c1 = new JCheckBoxMenuItem("Print");
            menu.add(c1);
            c1.addItemListener(this);

            ta = new JTextArea();
            ta.setBounds(200,50,100,100);
            c.add(ta);
            this.setJMenuBar(menubar);

        }

        @Override
        public void itemStateChanged(ItemEvent e) {

            if(c1.isSelected())
                ta.setText("Print is on");
            else
                ta.setText("Print is off");
        }
    }
}


