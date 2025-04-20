package OrientaçãoAObjeto;

public class PlanoPremium extends PlanoNormal {

  private boolean acessoConteudoExclusivo = true;
  private int limiteDownloads = 2;
  private boolean suportePrioritario = true;

  // Construtor
  public PlanoPremium(double Mensalidade, String QualidadeStreaming, String AparelhosCompatíveis, boolean anuncios,
      boolean acessoConteudoExclusivo, int limiteDownloads, boolean suportePrioritario) {

    super(Mensalidade, QualidadeStreaming, AparelhosCompatíveis, anuncios);
    this.limiteDownloads = limiteDownloads;
    this.acessoConteudoExclusivo = acessoConteudoExclusivo;
    this.suportePrioritario = suportePrioritario;
    this.setMensalidade(44.90);
    this.setAnuncios(false);
  }

  public PlanoPremium() {
  }

  // Getters e Setters

  public boolean getAcessoConteudoExclusivo() {
    return acessoConteudoExclusivo;
  }

  public void setAcessoConteudoExclusivo(boolean acessoConteudoExclusivo) {
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