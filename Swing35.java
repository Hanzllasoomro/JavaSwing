import javax.swing.*;
import java.awt.*;

public class Swing35 {
    public static void main(String[] args) {

        String[][] data = {{"001","Ali","21"},
                {"002","Umar","21"},
                {"003","AbuBakar","20"}};
        String[] columnNames = {"Roll Number","Name","Age"};

        JFrame f = new JFrame("JTable");
        f.setBounds(0,0,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(data,columnNames);
        f.add(new JScrollPane(table));

        f.setVisible(true);
    }
}
