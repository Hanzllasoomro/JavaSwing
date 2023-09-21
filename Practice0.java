import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
class Practice0{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GenericClassUI().setVisible(true);
            }
        });
    }

public static class GenericClassUI<T, U> extends JFrame {

    JButton addButton , updateButton , deleteButton;
    private JTextField textField1 , textField2;
    private JTable table;
    private DefaultTableModel tableModel;
    private List<T> list = new ArrayList<>();
    private List<U> list2 = new ArrayList<>();
    public GenericClassUI() {
        setTitle("GenericClass UI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));

        JLabel label1 = new JLabel("Enter Age:");
        JLabel label2 = new JLabel("Enter Name:");

        textField1 = new JTextField();
        textField2 = new JTextField();

        addButton = new JButton("Add to Table");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                T val1 = (T) textField1.getText();
                U val2 = (U) textField2.getText();

                list.add(val1);
                list2.add(val2);

                Object[] row = {val1, val2};
                tableModel.addRow(row);

                textField1.setText("");
                textField2.setText("");
            }
        });
        updateButton = new JButton("Update");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(textField1.getText().toString().isEmpty() ||
                        textField2.getText().toString().isEmpty()   )

                    JOptionPane.showMessageDialog(null,"Please fill All the Fields",
                            "Error",JOptionPane.ERROR_MESSAGE);

                else {
                    String name = textField2.getText().toString();
                    int age = Integer.parseInt(textField1.getText().toString());

                    int row = table.getSelectedRow();

                    tableModel.setValueAt(age,row,0);
                    tableModel.setValueAt(name,row,1);


                    textField1.setText(null);
                    textField2.setText(null);
                }
            }
        });
        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(table.getSelectedRow() == -1)
                    JOptionPane.showMessageDialog(null,"Please Select a row",
                            "Error",JOptionPane.ERROR_MESSAGE);

                int selection= JOptionPane.showConfirmDialog(null,
                        "Do you want to delete a row","Confirm",JOptionPane.YES_NO_OPTION);

                if(selection== JOptionPane.YES_OPTION)
                    tableModel.removeRow(table.getSelectedRow());
            }
        });

        inputPanel.add(label1);
        inputPanel.add(textField1);
        inputPanel.add(label2);
        inputPanel.add(textField2);
        inputPanel.add(addButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);


        tableModel = new DefaultTableModel();
        tableModel.addColumn("Age");
        tableModel.addColumn("Name");
        table = new JTable(tableModel);

        JScrollPane tableScrollPane = new JScrollPane(table);

        add(inputPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
    }
}
}