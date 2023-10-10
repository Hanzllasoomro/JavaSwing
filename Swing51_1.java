import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing51_1 extends JFrame {
    public static void main(String[] args) {
        new Swing51_1();
    }
    int updateIndex = 0;

    Swing51_1() {
        setLayout(new GridLayout(1, 2));
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

         panel = new JPanel();
         panel2 = new JPanel();
         list = new JList();
         textField = new JTextField(15);
         button1 = new JButton("Add");
         button2 = new JButton("Update");
         button3 = new JButton("Delete");

        DefaultListModel model = new DefaultListModel();
        model.addElement("10th");
        model.addElement("12th");
        model.addElement("Graduation");
        model.addElement("Post-Graduation");

        list.setModel(model);

        add(panel);
        add(panel2);
        panel.add(list);
        panel.setBackground(Color.BLACK);
        panel2.add(textField);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().toString().isEmpty()) {
                    String input = textField.getText().toString();
                    model.addElement(input);
                    textField.setText(null);
                }
            }
        });

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    updateIndex = list.getSelectedIndex();
                    textField.setText((String) model.get(updateIndex));
                }
                }
            });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().toString().isEmpty()) {
                    String input = textField.getText().toString();
                    model.set(updateIndex, input);
                    textField.setText(null);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().toString().isEmpty())
                    model.remove(updateIndex);
                }
        });
        revalidate();
        }
        JPanel panel , panel2;
        JList list;
        JTextField textField;
        JButton button1 , button2 , button3;
    }
