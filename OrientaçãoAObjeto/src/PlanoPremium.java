package OrientaçãoAObjeto.src;

public class PlanoPremium extends PlanoNormal {

  protected boolean acessoConteudoExclusivo;
  protected int limiteDownloads;
  protected boolean suportePrioritario;

  // Construtor
  public PlanoPremium(double Mensalidade, String QualidadeStreaming, String AparelhosCompatíveis, boolean anuncios,
      boolean acessoConteudoExclusivo, int limiteDownloads, boolean suportePrioritario) {

    super(Mensalidade, QualidadeStreaming, AparelhosCompatíveis, anuncios);

    this.limiteDownloads = 2;
    this.acessoConteudoExclusivo = true;
    this.suportePrioritario = true;
    this.setMensalidade(44.90);
    this.setAnuncios(false);
  }

  public PlanoPremium() {
  }

  // Getters e Setters

  public boolean getAcessoConteudoExclusivo() {
    return acessoConteudoExclusivo;
  }

  public void setacessoConteudoExclusivo(boolean acessoConteudoExclusivo) {
    this.acessoConteudoExclusivo = acessoConteudoExclusivo;
  }

  public int getLimiteDownloads() {
    return limiteDownloads;
  }

  public void setLimiteDownloads(int limiteDownloads) {
    this.limiteDownloads = limiteDownloads;
  }

  public boolean getSuportePrioritario() {
    return suportePrioritario;
  }

  public void setSuportePrioritario(boolean suportePrioritario) {
    this.suportePrioritario = suportePrioritario;
  }

}