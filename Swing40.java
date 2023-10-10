import javax.swing.*;

public class Swing40 extends JFrame {
    public static void main(String[] args) { new Swing40(); }

    JButton b1,b2;
    JSplitPane sp1;
    Swing40(){
        setTitle("JSplitPane Example");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        b1 = new JButton("Left");
        b2 = new JButton("Right");

        sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        sp1.setTopComponent(b1);
        sp1.setBottomComponent(b2);

        sp1.setDividerSize(10);
        sp1.setDividerLocation(100);
        sp1.setOneTouchExpandable(true);
        add(sp1);

        setVisible(true);
        validate();
    }
}
