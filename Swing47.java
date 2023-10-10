import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing47 extends JFrame {
    public static void main(String[] args) { new Swing47(); }

    JToggleButton tb;
    Container c;
    private Color defaultColor;
    Swing47(){

        setTitle("JEditorPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);
         c = getContentPane();
         c.setLayout(null);
         defaultColor = c.getBackground();

        tb = new JToggleButton("OFF");
        tb.setBounds(200,200,100,50);
        add(tb);
        tb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tb.isSelected()){
                    c.setBackground(Color.YELLOW);
                tb.setText("ON");
                }
                else{
                c.setBackground(defaultColor);
                tb.setText("OFF");
                }
            }
        });

        setVisible(true);
    }
}
