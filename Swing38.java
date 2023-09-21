import com.sun.source.tree.NewArrayTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing38 {
    public static void main(String[] args) {
        new CheckBoxMenuItem();
    }
    static class CheckBoxMenuItem extends JFrame{

        JMenuItem newfile = new JMenuItem("new");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem undo = new JMenuItem("Undo");
        JMenuItem redo = new JMenuItem("Redo");

        JCheckBoxMenuItem checkMenuItem = new JCheckBoxMenuItem("Word Wrap") ;
        JTextArea ta = new JTextArea("asdghkkjhgdsdsf");
        CheckBoxMenuItem(){

            setBounds(0,0,400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JMenuBar mb = new JMenuBar();
            add(mb,BorderLayout.PAGE_START);

            JMenu file = new JMenu("File");
            JMenu edit = new JMenu("Edit");
            JMenu format = new JMenu("Format");

            mb.add(file);
            mb.add(edit);
            mb.add(format);

            file.add(newfile);
            file.add(open);

            edit.add(undo);
            edit.add(redo);

            format.add(checkMenuItem);
            add(ta,BorderLayout.CENTER);
            checkMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(checkMenuItem.isSelected()){
                        ta.setLineWrap(true);
                        ta.setWrapStyleWord(true);
                    }
                    else {
                        ta.setLineWrap(false);
                        ta.setWrapStyleWord(false);
                    }
                }
            });

            setVisible(true);
            validate();
        }
    }
}
