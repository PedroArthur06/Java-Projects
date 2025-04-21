package CaixaDeTexto;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class ConfigTexto extends JFrame {
  private JTextArea caixaTexto;
  private JCheckBox negrito;
  private JCheckBox italico;
  private JCheckBox sublinhado;
  private JCheckBox aliEsquerda;
  private JCheckBox aliDireita;
  private JCheckBox aliCentro;
  private JComboBox<String> corTexto;

  public ConfigTexto() {
    super("Configuração de Texto");
    setLayout(new BorderLayout());

    // Caixa de texto com rolagem
    caixaTexto = new JTextArea("Digite seu texto aqui.", 5, 30);
    caixaTexto.setFont(new Font("Calibri", Font.PLAIN, 14));
    caixaTexto.setLineWrap(true);
    caixaTexto.setWrapStyleWord(true);

    // Scroll para o texto
    JScrollPane scrollPane = new JScrollPane(caixaTexto);
    add(scrollPane, BorderLayout.CENTER);

    // Painel para os checkboxes
    JPanel painelOpcoes = new JPanel();
    painelOpcoes.setLayout(new GridLayout(3, 3, 5, 5));

    // Opções de configuração
    negrito = new JCheckBox("Negrito");
    italico = new JCheckBox("Itálico");
    sublinhado = new JCheckBox("Sublinhado");
    aliEsquerda = new JCheckBox("Alinhar à Esquerda");
    aliDireita = new JCheckBox("Alinhar à Direita");
    aliCentro = new JCheckBox("Alinhar ao Centro");

    painelOpcoes.add(negrito);
    painelOpcoes.add(italico);
    painelOpcoes.add(sublinhado);
    painelOpcoes.add(aliEsquerda);
    painelOpcoes.add(aliDireita);
    painelOpcoes.add(aliCentro);

    add(painelOpcoes, BorderLayout.NORTH);

    // Painel para seleção de cor
    JPanel painelCor = new JPanel();
    painelCor.setLayout(new FlowLayout());

    JLabel labelCor = new JLabel("Cor do Texto:");
    corTexto = new JComboBox<>(new String[] { "Preto", "Vermelho", "Azul", "Verde" });
    painelCor.add(labelCor);
    painelCor.add(corTexto);

    add(painelCor, BorderLayout.SOUTH);

    // Adiciona os listeners
    CheckBoxHandler handler = new CheckBoxHandler();
    negrito.addItemListener(handler);
    italico.addItemListener(handler);
    sublinhado.addItemListener(handler);
    aliEsquerda.addItemListener(handler);
    aliDireita.addItemListener(handler);
    aliCentro.addItemListener(handler);
    corTexto.addActionListener(handler);
  }

  private class CheckBoxHandler implements ItemListener, ActionListener {
    public void itemStateChanged(ItemEvent event) {
      // Configurações de estilo
      int estilo = Font.PLAIN;
      if (negrito.isSelected())
        estilo += Font.BOLD;
      if (italico.isSelected())
        estilo += Font.ITALIC;

      Font font = new Font("Calibri", estilo, 14);

      // Sublinhado
      if (sublinhado.isSelected()) {
        Map<TextAttribute, Object> attributes = new HashMap<>();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        font = font.deriveFont(attributes);
      }

      // Aplica a fonte na caixa de texto
      caixaTexto.setFont(font);

      // Alinhamento (esquerda, direita, centro)
      if (aliEsquerda.isSelected()) {
        caixaTexto.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

      } else if (aliDireita.isSelected()) {
        caixaTexto.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

      } else if (aliCentro.isSelected()) {
        System.out.println("Centralização não suportada.");
      }
    }

    public void actionPerformed(ActionEvent event) {
      // Configurações de cor
      String cor = (String) corTexto.getSelectedItem();
      switch (cor) {
        case "Preto":
          caixaTexto.setForeground(Color.BLACK);
          break;
        case "Vermelho":
          caixaTexto.setForeground(Color.RED);
          break;
        case "Azul":
          caixaTexto.setForeground(Color.BLUE);
          break;
        case "Verde":
          caixaTexto.setForeground(Color.GREEN);
          break;
      }
    }
  }
}