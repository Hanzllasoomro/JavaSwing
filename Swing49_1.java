import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing49_1 extends JFrame {
    public static void main(String[] args) { new Swing49_1(); }

    Timer timer;
     Swing49_1(){


        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JLabel label = new JLabel("Welcome MY friend, Welcome!!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

        displayWelcomeScreen();
    }
    void displayWelcomeScreen(){
        JWindow window = new JWindow(this);
        window.setSize(600,400);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBackground(Color.WHITE);
        window.add(panel);

        String imagePath = "C:\\Users\\HP\\OneDrive\\Documents\\KONAMI\\PRO EVOLUTION SOCCER 2019\\WEPES\\Team\\eng\\emblem" +
                "\\ENG_ManchesterCity.png";
        JLabel label = new JLabel(new ImageIcon(imagePath));
        panel.add(label);

        JProgressBar pb = new JProgressBar(0,100);
        pb.setForeground(Color.CYAN);
        pb.setStringPainted(true);
        window.add(BorderLayout.PAGE_END,pb);
        window.revalidate();

         timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = pb.getValue();
                if(x == 100) {
                    window.dispose();
                    Swing49_1.this.setVisible(true);
                    timer.stop();
                } else {
                    pb.setValue(x+2);
                }
            }
        });
            timer.start();
    }
}
