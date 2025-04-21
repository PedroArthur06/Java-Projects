package CaixaDeTexto;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

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
    caixaTexto.setFont(new Font("Calibri", Font.PLAIN, 14));
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
    aliEsquerda.addItemListener(handler);
    aliDireita.addItemListener(handler);
    aliCentro.addItemListener(handler);
    sublinhado.addItemListener(handler);
    corTexto.addItemListener(handler);
  }

  private class CheckBoxHandler implements ItemListener {

    public void itemStateChanged(ItemEvent event) {

      Map<TextAttribute, Object> attributes = new HashMap<>();
      attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);

      Font font = null;

      // Determina a configuração do texto
      if (negrito.isSelected() && italico.isSelected())
        font = new Font("Calibri", Font.BOLD + Font.ITALIC, 14);

      else if (negrito.isSelected())
        font = new Font("Calibri", Font.BOLD, 14);

      else if (italico.isSelected())
        font = new Font("Calibri", Font.ITALIC, 14);

      else if (aliEsquerda.isSelected())
        caixaTexto.setAlignmentX(LEFT_ALIGNMENT);

      else if (aliDireita.isSelected())
        caixaTexto.setAlignmentX(RIGHT_ALIGNMENT);

      else if (aliCentro.isSelected())
        caixaTexto.setAlignmentX(CENTER_ALIGNMENT);

      else if (sublinhado.isSelected())
        font = new Font("Calibri", Font.PLAIN, 14).deriveFont(attributes);

      else if (corTexto.isSelected())
        caixaTexto.setForeground(java.awt.Color.RED);

      else if (corTexto.isSelected())
        caixaTexto.setForeground(java.awt.Color.RED);

      else if (corTexto.isSelected())
        caixaTexto.setForeground(java.awt.Color.RED);

      else
        font = new Font("Calibri", Font.PLAIN, 14);

      caixaTexto.setFont(font);
    }
  }
}