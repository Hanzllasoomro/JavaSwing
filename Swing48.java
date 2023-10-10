import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing48 extends JFrame {
    public static void main(String[] args) {    new Swing48();   }

    JFrame frame;
    JPanel panel ;
    JButton button1;
    Swing48(){
        frame = new JFrame("Swing Program");
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        frame.add(panel);

        button1 = new JButton("Click");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame,"JDialog1");
                dialog.setSize(200,200);
                dialog.setVisible(true);

                JPanel panel2 =new JPanel();
                dialog.add(panel2);

                JButton button2 = new JButton("Click");
                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JDialog dialog2 = new JDialog(dialog,"JDialog2");
                        dialog2.setSize(200,200);
                        dialog2.setVisible(true);
                        dialog2.add(new JLabel("This is Dialog2"));
                    }
                });
                panel2.add(button2);
            }
        });
        panel.add(button1);

        frame.setVisible(true);
    }
}
