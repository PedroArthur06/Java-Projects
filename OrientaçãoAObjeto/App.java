package OrientaçãoAObjeto;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        InterfaceUsuario tela = new InterfaceUsuario();

        tela.showPlanos();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(800, 500); // configura o tamanho do fram
        tela.setVisible(true); // exibe o frame

    }
}
