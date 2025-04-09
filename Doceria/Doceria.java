import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Doceria extends JFrame {
  private JSpinner spinnerBrigadeiro, spinnerBeijinho, spinnerCajuzinho;
  private JButton botaoPedir;

  public Doceria() {
    // Configuração básica da janela
    setTitle("Doceria - Sistema de Vendas");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(4, 3));

    // Preços dos doces
    double precoBrigadeiro = 3.00;
    double precoBeijinho = 2.50;
    double precoCajuzinho = 2.80;

    // Componentes da interface
    add(new JLabel("Brigadeiro - R$" + precoBrigadeiro));
    spinnerBrigadeiro = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
    add(spinnerBrigadeiro);

    add(new JLabel("Beijinho - R$" + precoBeijinho));
    spinnerBeijinho = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
    add(spinnerBeijinho);

    add(new JLabel("Cajuzinho - R$" + precoCajuzinho));
    spinnerCajuzinho = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1));
    add(spinnerCajuzinho);

    // Botão de pedido
    add(new JLabel());
    botaoPedir = new JButton("Pedir");
    add(botaoPedir);

    // Configurando o listener para o botão Pedir
    botaoPedir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int qtdBrigadeiro = (int) spinnerBrigadeiro.getValue();
        int qtdBeijinho = (int) spinnerBeijinho.getValue();
        int qtdCajuzinho = (int) spinnerCajuzinho.getValue();

        double total = (qtdBrigadeiro * precoBrigadeiro) +
            (qtdBeijinho * precoBeijinho) +
            (qtdCajuzinho * precoCajuzinho);

        JOptionPane.showMessageDialog(null,
            "Total do pedido: R$" + String.format("%.2f", total),
            "Resumo do Pedido",
            JOptionPane.INFORMATION_MESSAGE);
      }
    });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Doceria().setVisible(true);
      }
    });
  }
}
