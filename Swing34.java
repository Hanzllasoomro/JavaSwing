import javax.swing.*;

public class Swing34 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("JTabbedPane");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTabbedPane tp = new JTabbedPane(); //
        tp.setBounds(50,50,250,250);

        JPanel p = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p.add(new JLabel("First page"));
        p2.add(new JLabel("Second page"));
        p3.add(new JLabel("third page"));

        tp.add("First",p);
        tp.add("Second",p2);
        tp.add("Third",p3);


        frame.add(tp);
        frame.setVisible(true);
    }
}
