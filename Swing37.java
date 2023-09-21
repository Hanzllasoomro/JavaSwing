import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Swing37 {

    public static void main(String[] args) {

        new MyFrame();
    }
    static class MyFrame extends JFrame implements ActionListener {

        JPopupMenu pm; //
        JMenuItem mi1,mi2,mi3;
        MyFrame(){

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(20,20,500,500);
            setLayout(new FlowLayout());

            pm = new JPopupMenu();
            mi1 = new JMenuItem("Item 1");
            mi1.addActionListener(this);
            mi2 = new JMenuItem("Item 2");
            mi2.addActionListener(this);
            mi3 = new JMenuItem("Item 3");
            mi3.addActionListener(this);

            pm.add(mi1);
            pm.add(mi2);
            pm.add(mi3);

            add(pm);
            setVisible(true);
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if(e.getButton() == MouseEvent.BUTTON3){
                        int x = e.getX();
                        int y = e.getY();
                        pm.show(MyFrame.this,x,y);
                    }
                }
            });
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == mi1)
                System.out.println("Item 1 is selected");
            if(e.getSource() == mi2)
                System.out.println("Item 2 is selected");
            if(e.getSource() == mi3)
                System.out.println("Item 3 is selected");
        }
    }
}