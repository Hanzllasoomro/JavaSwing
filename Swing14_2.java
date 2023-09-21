import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing14_2 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 500);
        frame.setVisible(true);
    }

    static class MyFrame extends JFrame implements ActionListener {

        JMenuBar mb;
        JMenu file, edit;
        JMenuItem t1, t2, t3, t4, t5, t6;
        JTextArea ta;

        MyFrame() {
            Container c = getContentPane();
            c.setLayout(null);

            mb = new JMenuBar();
            file = new JMenu("File");
            edit = new JMenu("Edit");
            ta = new JTextArea();

            ta.setBounds(10, 10, 1520, 495);
            ta.setLineWrap(true);

            t1 = new JMenuItem("New");
            t2 = new JMenuItem("Open");
            t3 = new JMenuItem("Save");
            t4 = new JMenuItem("Copy");
            t5 = new JMenuItem("Paste");
            t6 = new JMenuItem("Select All");

            t1.addActionListener(this);
            t2.addActionListener(this);
            t3.addActionListener(this);
            t4.addActionListener(this);
            t5.addActionListener(this);
            t6.addActionListener(this);

            file.add(t1);
            file.add(t2);
            file.add(t3);
            edit.add(t4);
            edit.add(t5);
            edit.add(t6);

            mb.add(file);
            mb.add(edit);

            setJMenuBar(mb);
            c.add(ta);

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == t1)
                ta.setText("New File");
            if (e.getSource() == t2)
                ta.setText("Opened File");
            if (e.getSource() == t3)
                ta.setText("Saved File");
            if (e.getSource() == t4)
                ta.copy();
            if (e.getSource() == t5)
                ta.paste();
            if (e.getSource() == t6)
                ta.selectAll();
        }
    }
}
