import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing60 extends JApplet {
    JTextField textField;
    JButton button;
    public void init(){
        textField = new JTextField();
        button = new JButton();

        setLayout(null);
        textField.setBounds(20,20,100,30);
        button.setBounds(20,60,100,20);

        add(textField);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Booom");
            }
        });
    }
}
/*
<applet code"Swing60.class" width = "300" height ="300"></applet>
* */
