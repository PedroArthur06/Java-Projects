package CaixaDeTexto;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;

public class ConfigTexto extends JFrame {
  private JTextArea caixaTexto; // Substituímos JTextField por JTextArea
  private JCheckBox negrito;
  private JCheckBox italico;
  private JCheckBox aliEsquerda;
  private JCheckBox aliDireita;
  private JCheckBox aliCentro;
  private JCheckBox sublinhado;
  private JCheckBox corTexto;

  public ConfigTexto() {
    super("Caixa de texto");
    setLayout(new FlowLayout());

    caixaTexto = new JTextArea("Escolha a configuração do seu texto", 5, 20); // 5 linha e 20 colunas
    caixaTexto.setFont(new Font("Serif", Font.PLAIN, 14));
    caixaTexto.setLineWrap(true); // Quebra de linha automática
    caixaTexto.setWrapStyleWord(true);

    // Scroll se o texto for muito grande
    JScrollPane scrollPane = new JScrollPane(caixaTexto);
    add(scrollPane);

    negrito = new JCheckBox("Negrito");
    add(negrito);

    italico = new JCheckBox("Italico");
    add(italico);

    aliEsquerda = new JCheckBox("Alinhar a esquerda");
    add(aliEsquerda);

    aliDireita = new JCheckBox("Alinhar a direita");
    add(aliDireita);

    aliCentro = new JCheckBox("Alinhar ao centro");
    add(aliCentro);

    sublinhado = new JCheckBox("Sublinhado");
    add(sublinhado);

    corTexto = new JCheckBox("Cor do texto");
    add(corTexto);

    CheckBoxHandler handler = new CheckBoxHandler();
    negrito.addItemListener(handler);
    italico.addItemListener(handler);
  }

  private class CheckBoxHandler implements ItemListener {

    // Responde aos eventos de caixa de seleção
    public void itemStateChanged(ItemEvent event) {

      Font font = null;

      // Determina que CheckBoxes estão marcadas e cria Font
      if (negrito.isSelected() && italico.isSelected())
        font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

      else if (negrito.isSelected())
        font = new Font("Serif", Font.BOLD, 14);

      else if (italico.isSelected())
        font = new Font("Serif", Font.ITALIC, 14);

      else
        font = new Font("Serif", Font.PLAIN, 14);

      caixaTexto.setFont(font); // Configura a fonte do JTextArea
    }
  }

  public static void main(String[] args) {
    ConfigTexto frame = new ConfigTexto();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 300);
    frame.setVisible(true);
  }
}