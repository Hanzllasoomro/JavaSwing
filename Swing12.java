import javax.swing.*;

public class Swing12 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setBounds(0,0,600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JMenuBar bar = new JMenuBar();

        JMenu menu = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");

        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("Open");
        JMenuItem item3 = new JMenuItem("Save");
        JMenuItem item4 = new JMenuItem("Undo");
        JMenuItem item5 = new JMenuItem("Redo");
        JMenuItem item6 = new JMenuItem("Cut");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu2.add(item4);
        menu2.add(item5);
        menu2.add(item6);

        bar.add(menu);
        bar.add(menu2);

        frame.setJMenuBar(bar);
        frame.setVisible(true);
    }
}
