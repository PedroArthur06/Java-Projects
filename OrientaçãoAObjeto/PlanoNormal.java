package OrientaçãoAObjeto;

public class PlanoNormal {

  // Atributos
  private double Mensalidade;
  private String QualidadeStreaming;
  private String AparelhosCompatíveis;
  private boolean anuncios;

  // Construtor
  public PlanoNormal(double Mensalidade, String QualidadeStreaming, String AparelhosCompatíveis, boolean anuncios) {

    this.Mensalidade = 20.90;
    this.QualidadeStreaming = "Boa, 1080p (Full HD)";
    this.AparelhosCompatíveis = "TV, computador, celular, tablet";
    this.anuncios = true;
  }

  // Construtor vazio
  public PlanoNormal() {
  }

  // Getters e Setters
  public double getMensalidade() {
    return Mensalidade;
  }

  public void setMensalidade(double Mensalidade) {
    this.Mensalidade = Mensalidade;
  }

  public String getQualidadeStreaming() {
    return QualidadeStreaming;
  }

  public void setQualidadeStreaming(String QualidadeStreaming) {
    this.QualidadeStreaming = QualidadeStreaming;
  }

  public String getAparelhosCompatíveis() {
    return AparelhosCompatíveis;
  }

  public void setAparelhosCompatíveis(String AparelhosCompatíveis) {
    this.AparelhosCompatíveis = AparelhosCompatíveis;
  }

  public boolean isAnuncios() {
    return anuncios;
  }

  public void setAnuncios(boolean anuncios) {
    this.anuncios = anuncios;
  }
}
