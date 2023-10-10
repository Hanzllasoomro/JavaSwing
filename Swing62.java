import javax.swing.*;

public class Swing62 extends JFrame {
    JLabel userId,password;
    JTextField textField1 , textField2;
    JButton login,clear;
    JPasswordField passwordField;
    Swing62(){

        setSize(300,300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        userId =new JLabel("User ID");
        userId.setBounds(10,30,80,30);
        password = new JLabel("Password");
        password.setBounds(10,70,80,30);

        textField1 = new JTextField();
        textField1.setBounds(105,30,150,30);
        passwordField = new JPasswordField();
        passwordField.setBounds(105,70,150,30);

        login = new JButton("Login");
        login.setBounds(65,150,80,30);
        clear = new JButton("Clear");
        clear.setBounds(155,150,80,30);

        add(userId);
        add(password);
        add(textField1);
        add(passwordField);
        add(login);
        add(clear);
        setVisible(true);
    }

    public static void main(String[] args) {
        String str = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";

        try {
            UIManager.setLookAndFeel(str);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        new Swing62();
    }
}
