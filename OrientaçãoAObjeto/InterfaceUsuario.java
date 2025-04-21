package OrientaçãoAObjeto;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class InterfaceUsuario extends JFrame {

    public InterfaceUsuario() {
        super("Planos de assinatura");
        setLayout(new GridLayout(1, 1));
    }

    public void showPlanos() {
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(1, 3)); // 1 linha, 3 colunas

        // Planos de assinatura
        PlanoNormal planoNormal = new PlanoNormal(29.90, "HD", "Smart TV, Celular, Computador", true);

        PlanoPremium planoPremium = new PlanoPremium(44.90, "Full HD", "Smart TV, Celular, Computador", false, true, 2,
                true);

        PlanoVip planoVip = new PlanoVip(59.90, "4K Ultra HD", "Smart TV, Celular, Computador", false, true, true, true,
                true);

        // Subpainel para o Plano Normal
        JPanel painelPlanoNormal = new JPanel();
        painelPlanoNormal.setLayout(new GridLayout(0, 1));
        TitledBorder tituloPlanoNormal = BorderFactory.createTitledBorder("Plano Normal");
        tituloPlanoNormal.setTitleJustification(TitledBorder.CENTER);
        painelPlanoNormal.setBorder(tituloPlanoNormal);
        painelPlanoNormal.add(new JLabel("Mensalidade: R$ " + planoNormal.getMensalidade()));
        painelPlanoNormal.add(new JLabel("Qualidade de Streaming: " + planoNormal.getQualidadeStreaming()));
        painelPlanoNormal.add(new JLabel("Aparelhos Compatíveis: " + planoNormal.getAparelhosCompatíveis()));
        painelPlanoNormal.add(new JLabel("Anúncios: " + (planoNormal.isAnuncios() ? "Sim" : "Não")));
        JCheckBox checkboxPlanoNormal = new JCheckBox("Selecionar Plano Normal");
        painelPlanoNormal.add(checkboxPlanoNormal);

        // Subpainel para o Plano Premium
        JPanel painelPlanoPremium = new JPanel();
        painelPlanoPremium.setLayout(new GridLayout(0, 1));
        TitledBorder tituloPlanoPremium = BorderFactory.createTitledBorder("Plano Premium");
        tituloPlanoPremium.setTitleJustification(TitledBorder.CENTER);
        painelPlanoPremium.setBorder(tituloPlanoPremium);
        painelPlanoPremium.add(new JLabel("Mensalidade: R$ " + planoPremium.getMensalidade()));
        painelPlanoPremium.add(new JLabel("Qualidade de Streaming: " + planoPremium.getQualidadeStreaming()));
        painelPlanoPremium.add(new JLabel("Aparelhos Compatíveis: " + planoPremium.getAparelhosCompatíveis()));
        painelPlanoPremium.add(new JLabel("Anúncios: " + (planoPremium.isAnuncios() ? "Sim" : "Não")));
        painelPlanoPremium.add(new JLabel(
                "Acesso a Conteúdo Exclusivo: " + (planoPremium.getAcessoConteudoExclusivo() ? "Sim" : "Não")));
        painelPlanoPremium.add(new JLabel("Limite de Downloads: " + planoPremium.getLimiteDownloads()));
        painelPlanoPremium
                .add(new JLabel("Suporte Prioritário: " + (planoPremium.getSuportePrioritario() ? "Sim" : "Não")));
        JCheckBox checkboxPlanoPremium = new JCheckBox("Selecionar Plano Premium");
        painelPlanoPremium.add(checkboxPlanoPremium);

        // Subpainel para o Plano VIP
        JPanel painelPlanoVip = new JPanel();
        painelPlanoVip.setLayout(new GridLayout(0, 1));
        TitledBorder tituloPlanoVip = BorderFactory.createTitledBorder("Plano VIP");
        tituloPlanoVip.setTitleJustification(TitledBorder.CENTER);
        painelPlanoVip.setBorder(tituloPlanoVip);
        painelPlanoVip.add(new JLabel("Mensalidade: R$ " + planoVip.getMensalidade()));
        painelPlanoVip.add(new JLabel("Qualidade de Streaming: " + planoVip.getQualidadeStreaming()));
        painelPlanoVip.add(new JLabel("Aparelhos Compatíveis: " + planoVip.getAparelhosCompatíveis()));
        painelPlanoVip.add(new JLabel("Anúncios: " + (planoVip.isAnuncios() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Acesso a Eventos VIP: " + (planoVip.getAcessoEventosVip() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Plano Família: " + (planoVip.getPlanoFamilia() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Acesso Antecipado: " + (planoVip.getAcessoAnticipado() ? "Sim" : "Não")));
        painelPlanoVip.add(new JLabel("Áudio Espacial: " + (planoVip.getAudioEspacial() ? "Sim" : "Não")));
        JCheckBox checkboxPlanoVip = new JCheckBox("Selecionar Plano VIP");
        painelPlanoVip.add(checkboxPlanoVip);

        // Adiciona os subpainéis ao painel principal
        painelPrincipal.add(painelPlanoNormal);
        painelPrincipal.add(painelPlanoPremium);
        painelPrincipal.add(painelPlanoVip);

        // Adiciona o painel principal à janela
        add(painelPrincipal);

        // Exemplo de como capturar a seleção dos checkboxes
        checkboxPlanoNormal.addActionListener(e -> {
            if (checkboxPlanoNormal.isSelected()) {
                System.out.println("Plano Normal selecionado!");
            } else {
                System.out.println("Plano Normal desmarcado!");
            }
        });

        checkboxPlanoPremium.addActionListener(e -> {
            if (checkboxPlanoPremium.isSelected()) {
                System.out.println("Plano Premium selecionado!");
            } else {
                System.out.println("Plano Premium desmarcado!");
            }
        });

        checkboxPlanoVip.addActionListener(e -> {
            if (checkboxPlanoVip.isSelected()) {
                System.out.println("Plano VIP selecionado!");
            } else {
                System.out.println("Plano VIP desmarcado!");
            }
        });
    }
}