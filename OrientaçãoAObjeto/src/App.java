package OrientaçãoAObjeto.src;

import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuario1 = new Usuario();
        usuario1.setNome("Pedro arthur");
        usuario1.setEmail("pedro123@gmail.com");
        usuario1.setDataNascimento(2003);
        usuario1.setSenha("123456789");
        usuario1.setCpf("123.456.789-00");
        usuario1.setTelefone("1234567890");
        usuario1.salvar();

        JanelaGrafica janela = new JanelaGrafica();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 500);
        janela.setVisible(true);

    }
}
