import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginHandler implements ActionListener {
  private JTextField userField;
  private JPasswordField passwordField;

  public LoginHandler(JTextField userField, JPasswordField passwordField) {
    this.userField = userField;
    this.passwordField = passwordField;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String username = userField.getText();
    String password = new String(passwordField.getPassword());

    JOptionPane.showMessageDialog(null,
        "Login: " + username + "\nSenha: " + password,
        "Informações do Usuário",
        JOptionPane.INFORMATION_MESSAGE);
  }
}

public class Login {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Login");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 150);
    frame.setLayout(new GridLayout(3, 2));

    JLabel userLabel = new JLabel("Usuário:");
    JTextField userField = new JTextField();
    JLabel passwordLabel = new JLabel("Senha:");
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("OK");

    frame.add(userLabel);
    frame.add(userField);
    frame.add(passwordLabel);
    frame.add(passwordField);
    frame.add(loginButton);

    LoginHandler handler = new LoginHandler(userField, passwordField);
    loginButton.addActionListener(handler);

    frame.setVisible(true);
  }
}
