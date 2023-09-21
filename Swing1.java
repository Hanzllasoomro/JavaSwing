import javax.swing.*;
import java.awt.*;

class Swing1 {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame(); // JFrame

        frame.setVisible(true); // to make window visible
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// to close window with the program termination

        /*frame.setSize(700,500); // to set the size of window
        frame.setLocation(100,50); // location of window on screen
        ImageIcon image = new ImageIcon("fillename");
        frame.setIconImage(image.getImage()); //to create a window icon*/

        frame.setBounds(50,50,500,600); // sum of setSize and setLocation
        frame.setTitle("JAVA GRAPHICS"); //  to set the tittle of window

        Container c = frame.getContentPane();
        c.setBackground(Color.RED); // to set background color
        c.setForeground(Color.cyan);

        frame.setResizable(false); // to fix the window size
    }
}