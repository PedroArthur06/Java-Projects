import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Para executar rode: java -cp "Programa de login" Login 

public class Login extends JFrame {
  private JTextField campoLogin;
  private JPasswordField campoSenha;
  private JButton botaoOK;

  public Login() {
    setTitle("Sistema de Login");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 2));

    JLabel labelLogin = new JLabel("Login:");
    campoLogin = new JTextField();
    JLabel labelSenha = new JLabel("Senha:");
    campoSenha = new JPasswordField();
    botaoOK = new JButton("OK");

    add(labelLogin);
    add(campoLogin);
    add(labelSenha);
    add(campoSenha);
    add(new JLabel());
    add(botaoOK);

    botaoOK.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String login = campoLogin.getText();
        String senha = new String(campoSenha.getPassword());

        JOptionPane.showMessageDialog(null,
            "Login: " + login + "\nSenha: " + senha,
            "Credenciais",
            JOptionPane.INFORMATION_MESSAGE);
      }
    });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Login().setVisible(true);
      }
    });
  }
}
