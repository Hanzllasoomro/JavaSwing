import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing50 extends JFrame implements ActionListener {
    public static void main(String[] args) {   new Swing50();    }
    Swing50(){

        setTitle("Toolbar");
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        toolBar = new JToolBar();
        button1 = new JButton("1");
        button2 = new JButton("2");
        textField = new JTextField();
        comboBox = new JComboBox(items);
        label = new JLabel();

        toolBar.add(comboBox);
        toolBar.add(textField);
        toolBar.add(button1);
        toolBar.addSeparator();
        toolBar.add(button2);

        comboBox.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        textField.addActionListener(this);


        add(BorderLayout.NORTH,toolBar);
        add(label);
        toolBar.setFloatable(false);

        revalidate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1)
            label.setText("button1 is clicked");
           else if(e.getSource() == button2)
            label.setText("button2 is clicked");
               else if(e.getSource() == textField)
        label.setText("Enter is pressed in Text field");
                   else if(e.getSource() == comboBox)
            label.setText(comboBox.getSelectedItem()+"is selected");
    }
    JToolBar toolBar;
    JButton button1,button2;
    JTextField textField;
    JComboBox comboBox;
    JLabel label;
    String[] items = {"item1","item2","item3","item4","item5"};
}
