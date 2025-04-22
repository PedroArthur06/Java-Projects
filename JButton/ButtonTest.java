package JButton;

import javax.swing.JFrame;

public class ButtonTest {
    public static void main(String[] args) {
        ButtonFrame buttonFrame = new ButtonFrame(); // cria ButtonFrame
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(400, 330); // configura o tamanho do frame
        buttonFrame.setVisible(true); // exibe o frame
    } // fim de main
} // fim da classe ButtonTest