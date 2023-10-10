import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

class Transaction {
    String date;
    String description;
    String category;
    double amount;

    Transaction(String date, String description, String category, double amount) {
        this.date = date;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }
}

class FinanceTrackerApp extends JFrame implements ActionListener {
    private List<Transaction> transactions;
    private JTextField dateField, descriptionField, categoryField, amountField;
    private JTextArea transactionListArea;
    private double balance;

    FinanceTrackerApp() {
        setTitle("Personal Finance Tracker");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        transactions = new ArrayList<>();
        balance = 0.0;

        JLabel dateLabel = new JLabel("Date:");
        dateField = new JTextField(10);
        dateField.setToolTipText("dd-mm-yyyy");
        JLabel descriptionLabel = new JLabel("Description:");
        descriptionField = new JTextField(20);
        JLabel categoryLabel = new JLabel("Category:");
        categoryField = new JTextField(10);
        JLabel amountLabel = new JLabel("Amount:");
        amountField = new JTextField(10);

        JButton addButton = new JButton("Add Transaction");
        addButton.addActionListener(this);

        transactionListArea = new JTextArea(15, 30);
        transactionListArea.setEditable(false);

        add(dateLabel);
        add(dateField);
        add(descriptionLabel);
        add(descriptionField);
        add(categoryLabel);
        add(categoryField);
        add(amountLabel);
        add(amountField);
        add(addButton);
        add(transactionListArea);
    }

    public void actionPerformed(ActionEvent e) {
        String date = dateField.getText();
        String description = descriptionField.getText();
        String category = categoryField.getText();
        double amount = Double.parseDouble(amountField.getText());

        Transaction transaction = new Transaction(date, description, category, amount);
        transactions.add(transaction);

        balance += amount;

        // Update the transaction list display
        transactionListArea.append("Date: " + date + "\n");
        transactionListArea.append("Description: " + description + "\n");
        transactionListArea.append("Category: " + category + "\n");
        transactionListArea.append("Amount: $" + amount + "\n");
        transactionListArea.append("Balance: $" + balance + "\n\n");

        // Clear input fields
        dateField.setText("");
        descriptionField.setText("");
        categoryField.setText("");
        amountField.setText("");
    }

}
class Practice1{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FinanceTrackerApp app = new FinanceTrackerApp();
            app.setVisible(true);
        });
    }

}
