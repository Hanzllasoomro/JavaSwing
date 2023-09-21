import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing14 {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Action Event");
        frame.setBounds(0,0,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
class MyFrame extends JFrame implements ActionListener {
    Container c;
    JButton button;
    public  MyFrame(){
        c= getContentPane();
        c.setLayout(null);
        button = new JButton("Click me");
        button.setBounds(50,220,100,20);
        button.addActionListener(this);
        c.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = button.getText();
        button.setText(str.toUpperCase());
        button.setBackground(Color.PINK);
    }
}