import javax.swing.*;

public class Swing53 extends JFrame {
    public static void main(String[] args) {

        Swing53 frame = new Swing53();

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    Swing53(){

        rootPane = this.getRootPane();
        button1 = new JButton("Press me");
        button2 = new JButton();
        menuBar = new JMenuBar();
        file = new JMenu("File");

        file.add("New File");
        file.add("Open File");
        file.add("Save File");
        file.add("Close File");

        menuBar.add(file);
        rootPane.getContentPane().add(button1);
        rootPane.setJMenuBar(menuBar);
    }

    JRootPane rootPane;
    JButton button1, button2;
    JMenuBar menuBar;
    JMenu file;
}
