import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Swing43 extends JFrame {
    public static void main(String[] args) { new Swing43();}

    JSlider s;
    JLabel label;
    Swing43(){
        setTitle("JSlider Program");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        s = new JSlider();
        add(s);
        s.setMinimum(0);
        s.setMaximum(200);
        s.setPaintTicks(true);
        s.setPaintLabels(true);
        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);
        s.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("knob is at "+s.getValue());
            }
        });

        label = new JLabel();
        label.setText("knob is at "+s.getValue());
        add(label);

        setVisible(true);
        validate();
    }
}
