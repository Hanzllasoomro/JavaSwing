import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing15_3{
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("ItemEvent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 500);
        frame.setVisible(true);
    }

    static class MyFrame extends JFrame implements ItemListener {

        JCheckBox cb,cb2,cb3,cb4;
        JTextArea ta;
        public MyFrame() {

            Container c = getContentPane();
            c.setLayout(null);

            cb = new JCheckBox("10th");
            cb2 = new JCheckBox("12th");
            cb3 = new JCheckBox("Graduation");
            cb4 = new JCheckBox("PostGraduation");

            cb.setBounds(50,50,100,30);
            cb2.setBounds(50,100,100,30);
            cb3.setBounds(50,150,100,30);
            cb4.setBounds(50,200,100,30);

            cb.addItemListener(this);
            cb2.addItemListener(this);
            cb3.addItemListener(this);
            cb4.addItemListener(this);

            ta = new JTextArea();
            ta.setBounds(200,50,100,100);
            c.add(ta);
            c.add(cb);
            c.add(cb2);
            c.add(cb3);
            c.add(cb4);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {

          if(cb.isSelected())
              ta.setText(cb.getText());
          if(cb2.isSelected())
                ta.setText(ta.getText()+"\n"+cb2.getText());
          if(cb3.isSelected())
                ta.setText(ta.getText()+"\n"+cb3.getText());
          if(cb4.isSelected())
                ta.setText(ta.getText()+"\n"+cb4.getText());
        }
    }
}


