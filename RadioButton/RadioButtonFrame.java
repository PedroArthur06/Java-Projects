import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame {

  private JTextField textField; // campo de texto para exibir a fonte
  private Font plainFont; // fonte para texto em estilo simples
  private Font boldFont; // fonte para texto em negrito
  private Font italicFont; // fonte para texto em italico
  private Font boldItalicFont; // fonte para texto em negrito e italico
  private JRadioButton plainJRadioButton; // seleciona o estilo simples
  private JRadioButton boldJRadioButton; // seleciona o estilo negrito
  private JRadioButton italicJRadioButton; // seleciona o estilo italico
  private JRadioButton boldItalicJRadioButton; // seleciona o estilo negrito e italico
  private ButtonGroup radioGroup; // grupo de botões de opção

  public RadioButtonFrame() {
    super("RadioButton Test");
    setLayout(new FlowLayout()); // configura o layout de frame
    textField = new JTextField("Watch the font style change", 25); // cria campo de texto
    add(textField); // adiciona textField ao JFrame

    // cria botões de opção
    plainJRadioButton = new JRadioButton("Plain", true);
    boldJRadioButton = new JRadioButton("Bold", false);
    italicJRadioButton = new JRadioButton("Italic", false);
    boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);

    // Adiciona os botões de opção ao JFrame
    add(plainJRadioButton);
    add(boldJRadioButton);
    add(italicJRadioButton);
    add(boldItalicJRadioButton);

    // cria relacionamento lógico entre JRadioButtons
    radioGroup = new ButtonGroup(); // cria ButtonGroup
    radioGroup.add(plainJRadioButton); // adiciona simples ao grupo
    radioGroup.add(boldJRadioButton); // adiciona negrito ao grupo
    radioGroup.add(italicJRadioButton); // adiciona italico ao grupo
    radioGroup.add(boldItalicJRadioButton); // adiciona negrito e italico ao grupo

    // cria fonte objetos
    plainFont = new Font("Calibri", Font.PLAIN, 14);
    boldFont = new Font("Calibri", Font.BOLD, 14);
    italicFont = new Font("Calibri", Font.ITALIC, 14);
    boldItalicFont = new Font("Calibri", Font.BOLD + Font.ITALIC, 14);
    textField.setFont(plainFont); // configura a fonte inicial como simples

    // registra eventos para JRadioButtons
    plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
    boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
    italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
    boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
  }

  private class RadioButtonHandler implements ItemListener {
    private Font font; // fonte associada com esse listener

    public RadioButtonHandler(Font f) {
      font = f; // configura a fonte desse listener
    }

    public void itemStateChanged(ItemEvent event) {
      textField.setFont(font); // configura fonte de textField
    }
  }
}