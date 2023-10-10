import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Swing39 extends JFrame {

    Swing39(){

        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1,1));
        panel.add(new JLabel("1st Label"));
        panel.add(new JSeparator(SwingConstants.VERTICAL));
        panel.add(new JLabel("2nd Label"));
        add(panel);

        JMenuBar mb = new JMenuBar();
        add(mb, BorderLayout.PAGE_START);

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        mb.add(file);
        mb.add(edit);

        JMenuItem  undo = new JMenuItem("undo");
        JMenuItem  redo = new JMenuItem("redo");
        JMenuItem  cut = new JMenuItem("cut");
        JMenuItem  copy = new JMenuItem("copy");
        JMenuItem  paste = new JMenuItem("paste");
        JMenuItem  find = new JMenuItem("Find");
        JMenuItem  findNext = new JMenuItem("Find Next");
        JMenuItem  replace = new JMenuItem("replace");

        edit.add(undo);
        edit.add(redo);
        edit.addSeparator();
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.addSeparator();
        edit.add(find);
        edit.add(findNext);
        edit.add(replace);

        validate();
    }
    public static void main(String[] args) {

        new Swing39();
    }
}
