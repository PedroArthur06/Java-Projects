package OrientaçãoAObjeto.src;

class PlanoVip extends PlanoPremium {

  private boolean acessoEventosVip;
  private boolean planoFamilia;
  private boolean acessoAnticipado;
  private boolean AudioEspacial;

  public PlanoVip(double mensalidade, String qualidadeStreaming, String aparelhosCompatíveis, boolean anuncios,
      boolean acessoEventosVip, boolean planoFamilia, boolean acessoAnticipado, boolean audioEspacial) {

    super(mensalidade, qualidadeStreaming, aparelhosCompatíveis, anuncios, true, 10, true);

    this.acessoEventosVip = acessoEventosVip;
    this.planoFamilia = planoFamilia;
    this.acessoAnticipado = acessoAnticipado;
    this.AudioEspacial = audioEspacial;
  }

  public PlanoVip() {
  }

  public boolean getAcessoEventosVip() {
    return acessoEventosVip;
  }

  public void setAcessoEventosVip(boolean acessoEventosVip) {
    this.acessoEventosVip = acessoEventosVip;
  }

  public boolean getPlanoFamilia() {
    return planoFamilia;
  }

  public void setPlanoFamilia(boolean planoFamilia) {
    this.planoFamilia = planoFamilia;
  }

  public boolean getAcessoAnticipado() {
    return acessoAnticipado;
  }

  public void setAcessoAnticipado(boolean acessoAnticipado) {
    this.acessoAnticipado = acessoAnticipado;
  }

  public boolean getAudioEspacial() {
    return AudioEspacial;
  }

  public void setAudioEspacio(boolean AudioEspacial) {
    this.AudioEspacial = AudioEspacial;
  }

}
