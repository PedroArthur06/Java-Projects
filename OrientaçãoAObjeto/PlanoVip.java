package OrientaçãoAObjeto;

class PlanoVip extends PlanoNormal {
  private boolean acessoEventosVip = true;
  private boolean planoFamilia = true;
  private boolean acessoAnticipado = true;
  private boolean AudioEspacial = true;

  public PlanoVip(boolean acessoEventosVip, boolean planoFamilia, boolean acessoAnticipado, boolean AudioEspacial,
      double Mensalidade,
      String QualidadeStreaming, String AparelhosCompatíveis, boolean anuncios) {

    super(Mensalidade, QualidadeStreaming, AparelhosCompatíveis, anuncios);
    this.acessoEventosVip = acessoEventosVip;
    this.planoFamilia = planoFamilia;
    this.acessoAnticipado = acessoAnticipado;
    this.AudioEspacial = AudioEspacial;
    this.setMensalidade(59.90);
    this.setQualidade("Excepcional, 4K (Ultra HD) + HDR");
    this.setAnuncios(false);

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
