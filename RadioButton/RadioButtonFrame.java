import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame {

  private JTextField textField; // utilizado par
  private Font plainFont; // fonte para texto si
  private Font boldFont; // fonte para texto em
  private Font italicFont; // fonte para texto e
  private Font boldItalicFont; // fonte para tex
  private JRadioButton plainJRadioButton; // sel
  private JRadioButton boldJRadioButton; // sele
  private JRadioButton italicJRadioButton; // se
  private JRadioButton boldItalicJRadioButton;
  private ButtonGroup radioGroup; // buttongroup

  public RadioButtonFrame() {
    super("RadioButton Test");
    setLayout(new FlowLayout()); // configura o layout de frame
    textField = new JTextField("Watch the font style change", 25);
    add(textField); // adiciona textField ao JFrame
    // cria botÃµes de opÃ§Ã£o
    plainJRadioButton = new JRadioButton("Plain", true);
    boldJRadioButton = new JRadioButton("Bold", false);
    italicJRadioButton = new JRadioButton("Italic", false);
    boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
    add(plainJRadioButton); // adiciona botÃ£o no estilo simples ao JF
    add(boldJRadioButton); // adiciona botÃ£o de negrito ao JFrame
    add(italicJRadioButton); // adiciona botÃ£o de itÃ¡lico ao JFrame
    add(boldItalicJRadioButton); // adiciona botÃ£o de negrito e itÃ¡li
    // cria relacionamento lÃ³gico entre JRadioButtons
    radioGroup = new ButtonGroup(); // cria ButtonGroup
    radioGroup.add(plainJRadioButton); // adiciona simples ao grupo radioGroup.add(boldJRadioButton); /

    radioGroup.add(italicJRadioButton); // adiciona itÃ¡lico ao grupo
    radioGroup.add(boldItalicJRadioButton); // adiciona negrito e itÃ¡
    // cria fonte objetos
    plainFont = new Font("Serif", Font.PLAIN, 14);
    boldFont = new Font("Serif", Font.BOLD, 14);
    italicFont = new Font("Serif", Font.ITALIC, 14);
    boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
    textField.setFont(plainFont); // configura a fonte inicial como si
    // registra eventos para JRadioButtons
    plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
    boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
    italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
    boldItalicJRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
  }

  private class RadioButtonHandler implements ItemListener {
    private Font font; // fonte associada com esse listen

    public RadioButtonHandler(Font f) {
      font = f; // configura a fonte desse listener
    } // fim do construtor RadioButtonHandler
    // trata eventos de botÃ£o de opÃ§Ã£o

    public void itemStateChanged(ItemEvent event) {
      textField.setFont(font); // configura fonte de te
    } // fim do mÃ©todo itemStateChanged
  }
  // fim da classe RadioButtonHandler interna private
}// fim da classe RadioButton