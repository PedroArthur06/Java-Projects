package OrientaçãoAObjeto;

import javax.swing.JFrame;
import CheckBox.CheckBoxFrame;

public class App {
    public static void main(String[] args) throws Exception {

        CheckBoxFrame tela = new CheckBoxFrame();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(275, 100); // configura o tamanho do fram
        tela.setVisible(true); // exibe o frame

    }
}
