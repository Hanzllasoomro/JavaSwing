import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Swing35_1 {
    public static void main(String[] args) {
        new MyFrame();
    }
    static class MyFrame extends JFrame{

        static Container c;
        JTable table;
        JButton b1,b2,b3;
        JTextField t1,t2,t3;
        MyFrame(){

            Object[][] data = {{001,"Ali",21},
                    {002,"Umar",21},
                    {003,"Abu Bakar",20}};
            String[] columnNames = {"Roll Number","Name","Age"};

            setBounds(20,20,500,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            DefaultTableModel model = new DefaultTableModel(data,columnNames);
            table = new JTable(model);

            setLayout(new GridLayout(3,1));

            JPanel panel = new JPanel();
            add(new JScrollPane(table));
            add(new JPanel());
            add(panel);

            t1 =new JTextField();
            t2 =new JTextField();
            t3 =new JTextField();

            b1 = new JButton("Add");
            b2 = new JButton("Update");
            b3 = new JButton("Delete");

            panel.setLayout(new GridLayout(3,3));
            panel.add(new JLabel("Roll Number"));
            panel.add(t1);
            panel.add(b1);

            panel.add(new JLabel("Names"));
            panel.add(t2);
            panel.add(b2);

            panel.add(new JLabel("Ages"));
            panel.add(t3);
            panel.add(b3);

            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(t1.getText().toString().isEmpty() ||
                       t2.getText().toString().isEmpty() ||
                       t3.getText().toString().isEmpty()    )

                    JOptionPane.showMessageDialog(null,"Please fill All the Fields",
                            "Error",JOptionPane.ERROR_MESSAGE);

                    else {
                        int rollNumber = Integer.parseInt(t1.getText().toString());
                        String name = t2.getText().toString();
                        int age = Integer.parseInt(t3.getText().toString());

                        Object[] newRow = {rollNumber, name, age};
                        model.addRow(newRow);

                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                    }
                }
            });


            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(t1.getText().toString().isEmpty() ||
                            t2.getText().toString().isEmpty() ||
                            t3.getText().toString().isEmpty()    )

                        JOptionPane.showMessageDialog(null,"Please fill All the Fields",
                                "Error",JOptionPane.ERROR_MESSAGE);

                    else {
                        int rollNumber = Integer.parseInt(t1.getText().toString());
                        String name = t2.getText().toString();
                        int age = Integer.parseInt(t3.getText().toString());

                        int row = table.getSelectedRow();

                        model.setValueAt(rollNumber,row,0);
                        model.setValueAt(name,row,1);
                        model.setValueAt(age,row,2);


                        t1.setText(null);
                        t2.setText(null);
                        t3.setText(null);
                    }
                }
            });

            b3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(table.getSelectedRow() == -1)
                        JOptionPane.showMessageDialog(null,"Please Select a row",
                                "Error",JOptionPane.ERROR_MESSAGE);

                   int selection= JOptionPane.showConfirmDialog(null,
                           "Do you want to delete a row","Confirm",JOptionPane.YES_NO_OPTION);

                    if(selection== JOptionPane.YES_OPTION)
                        model.removeRow(table.getSelectedRow());
                }
            });
            table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int rowIndex =table.getSelectedRow();

                    int rollNumber= (int)model.getValueAt(rowIndex,0);
                    String name = (String)model.getValueAt(rowIndex,1);
                    int age = (int)model.getValueAt(rowIndex,2);

                    t1.setText(String.valueOf(rollNumber));
                    t2.setText(name);
                    t3.setText(String.valueOf(age));
                }
            });
            setVisible(true);
        }
    }
}