package OrientaçãoAObjeto;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceUsuario extends JFrame {

    public InterfaceUsuario() {
        // Configurações da janela
        super("Planos de assinatura");
        setLayout(new GridLayout(1, 1)); // Configura o layout da janela
    }

    public void showPlanos() {
        // Painel principal para organizar os planos lado a lado
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(1, 3)); // 1 linha, 3 colunas (um para cada plano)

        // Planos de assinatura
        PlanoNormal planoNormal = new PlanoNormal(29.90, "HD", "Smart TV, Celular, Computador", true);
        PlanoPremium planoPremium = new PlanoPremium(44.90, "Full HD", "Smart TV, Celular, Computador", false, true, 2,
                true);
        PlanoVip planoVip = new PlanoVip(59.90, "4K Ultra HD", "Smart TV, Celular, Computador", false, true, true, true,
                true);

        // Subpainel para o Plano Normal
        JPanel painelPlanoNormal = new JPanel();
        painelPlanoNormal.setLayout(new GridLayout(0, 1)); // Layout vertical
        painelPlanoNormal.add(new JLabel("Plano Normal:"));
        painelPlanoNormal.add(new JLabel("Mensalidade: R$ " + planoNormal.getMensalidade()));
        painelPlanoNormal.add(new JLabel("Qualidade de Streaming: " + planoNormal.getQualidadeStreaming()));
        painelPlanoNormal.add(new JLabel("Aparelhos Compatíveis: " + planoNormal.getAparelhosCompatíveis()));
        painelPlanoNormal.add(new JLabel("Anúncios: " + (planoNormal.isAnuncios() ? "Sim" : "Não")));

        // Subpainel para o Plano Premium
        JPanel painelPlanoPremium = new JPanel();
        painelPlanoPremium.setLayout(new GridLayout(0, 1)); // Layout vertical
        painelPlanoPremium.add(new JLabel("Plano Premium:"));
        painelPlanoPremium.add(new JLabel("Mensalidade: R$ " + planoPremium.getMensalidade()));
        painelPlanoPremium.add(new JLabel("Qualidade de Streaming: " + planoPremium.getQualidadeStreaming()));
        painelPlanoPremium.add(new JLabel("Aparelhos Compatíveis: " + planoPremium.getAparelhosCompatíveis()));
        painelPlanoPremium.add(new JLabel("Anúncios: " + (planoPremium.isAnuncios() ? "Sim" : "Não")));
        painelPlanoPremium.add(new JLabel(
                "Acesso a Conteúdo Exclusivo: " + (planoPremium.getAcessoConteudoExclusivo() ? "Sim" : "Não")));
        painelPlanoPremium.add(new JLabel("Limite de Downloads: " + planoPremium.getLimiteDownloads()));
        painelPlanoPremium
                .add(new JLabel("Suporte Prioritário: " + (planoPremium.getSuportePrioritario() ? "Sim" : "Não")));

        // Subpainel para o Plano VIP
        JPanel painelPlanoVip = new JPanel();
        painelPlanoVip.setLayout(new GridLayout(0, 1)); // Layout vertical
        painelPlanoVip.add(new JLabel("Plano VIP:"));
        painelPlanoVip.add(new JLabel("Mensalidade: R$ " + planoVip.getMensalidade()));
        painelPlanoVip.add(new JLabel("Qualidade de Streaming: " + planoVip.getQualidadeStreaming()));
        painelPlanoVip.add(new JLabel("Aparelhos Compatíveis: " + planoVip.getAparelhosCompatíveis()));
        painelPlanoVip.add(new JLabel("Anúncios: " + (planoVip.isAnuncios() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Acesso a Eventos VIP: " + (planoVip.getAcessoEventosVip() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Plano Família: " + (planoVip.getPlanoFamilia() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Acesso Antecipado: " + (planoVip.getAcessoAnticipado() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Áudio Espacial: " + (planoVip.getAudioEspacial() ? "Sim" : "Não")));

        // Adiciona os subpainéis ao painel principal
        painelPrincipal.add(painelPlanoNormal);
        painelPrincipal.add(painelPlanoPremium);
        painelPrincipal.add(painelPlanoVip);

        // Adiciona o painel principal à janela
        add(painelPrincipal);
    }
}