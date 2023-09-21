import javax.swing.*;
import java.awt.*;

public class Swing36 {
    public static void main(String[] args) {

        JFrame f = new JFrame("JProgress bar");
        f.setBounds(10,10,500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        javax.swing.JProgressBar pb = new javax.swing.JProgressBar(0,100); //
        pb.setStringPainted(true);
        /*pb.setOrientation(SwingConstants.VERTICAL);*/

        f.add(pb);
        f.setVisible(true);

        int i=0;
        while(i <=100){

            if(i>=0 && i<50)
                pb.setString(i + "% Processing...");
            if(i>50 && i<70)
                pb.setString(i + "% Wait for moment...");
            if(i>70 && i<90)
                pb.setString(i + "%About to complete...");
            if(i==100)
                pb.setString(i + "% task Finished...");

            pb.setValue(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            i++;
        }

    }
}
