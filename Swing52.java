import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;
import java.awt.*;

public class Swing52 extends JFrame {
    public static void main(String[] args) {        new Swing52();    }

    Swing52(){

        frame = new JFrame("JTextPane");
        textPane = new JTextPane();
        sas = new SimpleAttributeSet();

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        StyleConstants.setBold(sas, true);
//        textPane.setText("IM HANZLLA SOOMRO DOING MY JOB ON JAVA SWING FOR UPCOMING PROJECTS ...");

        textPane.setCharacterAttributes(sas , true);
        textPane.setText("IM ");

        Document doc = textPane.getStyledDocument();
        try{
            sas = new SimpleAttributeSet();
            StyleConstants.setItalic(sas, true);
            doc.insertString(doc.getLength(), "HANZLLA SOOMRO ",sas);

            sas = new SimpleAttributeSet();
            StyleConstants.setUnderline(sas, true);
            doc.insertString(doc.getLength(), "DOING MY JOB ",sas);

            sas = new SimpleAttributeSet();
            StyleConstants.setForeground(sas, Color.red);
            doc.insertString(doc.getLength(), "ON JAVA ",sas);

        }catch(BadLocationException e){
            e.getCause();
        }

        frame.getContentPane().add(textPane);
    }
    JFrame frame;
    JTextPane textPane;
    SimpleAttributeSet sas;
}
