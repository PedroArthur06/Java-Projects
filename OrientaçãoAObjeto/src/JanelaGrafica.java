package OrientaçãoAObjeto.src;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaGrafica extends JFrame {
  private JFrame frame;
  private JPanel painel;

  public JanelaGrafica() {
    frame = new JFrame("Janela Gráfica");
    painel = new JPanel();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.add(painel);
    frame.setVisible(true);
  }

}