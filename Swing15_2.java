import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swing15_2 {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("ItemEvent");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 500);
        frame.setVisible(true);
    }

    static class MyFrame extends JFrame implements ItemListener {

        JRadioButton male,female;
        JTextArea ta;
        public MyFrame() {

            Container c = getContentPane();
            c.setLayout(null);

            male = new JRadioButton("MALE");
            male.setBounds(50,50,100,20);
            female = new JRadioButton("FEMALE");
            c.add(male);
            male.addItemListener(this);
            female.setBounds(50,100,100,20);
            c.add(female);
            female.addItemListener(this);

            ButtonGroup bg = new ButtonGroup();
            bg.add(male);
            bg.add(female);

            ta = new JTextArea();
            ta.setBounds(200,50,100,100);
            c.add(ta);
        }

        @Override
        public void itemStateChanged(ItemEvent e) {

        if(e.getSource()==male)
            ta.setText("male is Clicked");
        if(e.getSource()==female)
            ta.setText("female is clicked");
        }
    }
}


