package CheckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame {
    private JTextField textField; // exibe o texto na alteração de fonte
    private JCheckBox boldJCheckBox; // para selecionar/remover estilo n
    private JCheckBox italicJCheckBox; // para selecionar/remover itálico

    // construtor CheckBoxFrame adiciona JCheckBoxes ao JFrame
    public CheckBoxFrame() {

        super("JCheckBox Test");
        setLayout(new FlowLayout()); // configura o layout de frame


        // configura JTextField e sua fonte
        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField); // adiciona textField ao JFrame

        boldJCheckBox = new JCheckBox("Bold"); // cria caixa de seleção p
        italicJCheckBox = new JCheckBox("Italic"); // cria italic
        add(boldJCheckBox); // adiciona caixa de seleção de estilo negrit
        add(italicJCheckBox); // adiciona caixa de seleção de itā

        // listeners registradores para JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);

    } // fim do construtor CheckBox Frame

    // classe interna private para tratamento de evento ItemListen
    private class CheckBoxHandler implements ItemListener {

        // responde aos eventos de caixa de seleção
        public void itemStateChanged(ItemEvent event) {

            Font font = null;

            // determina que CheckBoxes estão marcadas e cria Font
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

            else if (boldJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);

            else if (italicJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);

            else
                font = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font); // configura a fonte do textField
        } // fim do método itemStateChanged
    } // fim da classe CheckBoxHandler interna private
} // fim da classe CheckBoxFrame
