import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing46 extends JFrame {
    public static void main(String[] args) { new Swing46(); }

    JEditorPane ep;
    JButton b1;
    Swing46(){

        setTitle("JEditorPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,500);
        setLocationRelativeTo(null);

        b1 = new JButton("Show Code");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(""+ep.getText());
            }
        });
        add(b1,BorderLayout.PAGE_END);

        ep = new JEditorPane();
        ep.setContentType("text/html");
        ep.setText("<html>"+
                "<h1 color = 'red'> Hello World</h>"+
                "<p> this is my paragraph</P>"+
                "<hr>"+
                "<ol>"+
                "<li> item1</li>"+
                "<li> item 2 </li>"+
                "<li> item3 </li>" +
                "</ol>"+
                "</html>");

        add(ep, BorderLayout.CENTER);

        setVisible(true);

    }
}
