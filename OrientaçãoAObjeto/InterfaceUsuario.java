package OrientaçãoAObjeto;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JCheckBox;

public class InterfaceUsuario extends JFrame {

    private JTextField textField; // exibe o texto na alteração de fonte
    private JCheckBox boldJCheckBox; // para selecionar/remover estilo n
    private JCheckBox italicJCheckBox; // para selecionar/remover itálico

    // construtor CheckBoxFrame adiciona JCheckBoxes ao JFrame
    public InterfaceUsuario() {

        super("Planos");
        setLayout(new FlowLayout()); // configura o layout de frame

        boldJCheckBox = new JCheckBox("Bold"); // cria caixa de seleção p
        italicJCheckBox = new JCheckBox("Italic"); // cria italic
        add(boldJCheckBox); // adiciona caixa de seleção de estilo negrit
        add(italicJCheckBox); // adiciona caixa de seleção de itā
    }

    // método para mostrar o as características do plano
    public void showPlanos() {

        // Cria os planos
        PlanoNormal planoNormal = new PlanoNormal(29.90, "HD", "Smart TV, Celular, Computador", true);

        PlanoPremium planoPremium = new PlanoPremium(44.90, "Full HD", "Smart TV, Celular, Computador", false, true, 2,
                true);

        // Exibe as características dos planos
        System.out.println("Plano Normal:");
        System.out.println("Mensalidade: " + planoNormal.getMensalidade());
        System.out.println("Qualidade de Streaming: " + planoNormal.getQualidadeStreaming());
        System.out.println("Aparelhos Compatíveis: " + planoNormal.getAparelhosCompatíveis());
        System.out.println("Anúncios: " + planoNormal.isAnuncios());

        System.out.println("\nPlano Premium:");
        System.out.println("Mensalidade: " + planoPremium.getMensalidade());
        System.out.println("Qualidade de Streaming: " + planoPremium.getQualidadeStreaming());
        System.out.println("Aparelhos Compatíveis: " + planoPremium.getAparelhosCompatíveis());
        System.out.println("Anúncios: " + planoPremium.isAnuncios());
        System.out.println("Acesso a Conteúdo Exclusivo: " + planoPremium.getAcessoConteudoExclusivo());
        System.out.println("Limite de Downloads: " + planoPremium.getLimiteDownloads());
        System.out.println("Suporte Prioritário: " + planoPremium.getSuportePrioritario());
        System.out.println("\nPlano VIP:");

        PlanoVip planoVip = new PlanoVip(59.90, "Excepcional, 4K (Ultra HD) + HDR", "Smart TV, Celular, Computador",
                false, true, true, true, true);
        System.out.println("Mensalidade: " + planoVip.getMensalidade());
        System.out.println("Qualidade de Streaming: " + planoVip.getQualidadeStreaming());
        System.out.println("Aparelhos Compatíveis: " + planoVip.getAparelhosCompatíveis());

    }

}
