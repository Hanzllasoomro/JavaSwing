import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Swing49 extends JFrame {
    public static void main(String[] args) {    new Swing49();   }
    JPanel panel ;
    JButton button1;
    Swing49(){

        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        add(panel);

        button1 = new JButton("Click");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JWindow window = new JWindow();
                window.setSize(300,200);
                window.setLocationRelativeTo(null);
                window.setVisible(true);

                JPanel panel2 = new JPanel();
                panel2.setBackground(Color.YELLOW);
                panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel2.add(new JLabel("this is new window"));
                window.add(panel2);

                window.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(e.getClickCount() == 2)
                            window.dispose();
                    }
                });
            }
        });
        panel.add(button1);

        setVisible(true);
        validate();
    }
}
