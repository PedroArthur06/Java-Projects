package OrientaçãoAObjeto;

public class UsuarioPremium extends Usuario {
  private String dataDeCadastro;
  private String dataDeVencimento;
  private String tipoDePlano;

  public UsuarioPremium(String nome, String email, String senha, String telefone, String endereco,
      String dataNascimento, String cpf, String nacionalidade, String estadoCivil, String profissao,
      String dataDeCadastro, String dataDeVencimento, String tipoDePlano) {

    // Chama o construtor da classe pai (Usuario)
    super(nome, email, senha, telefone, endereco, dataNascimento, cpf, nacionalidade);

    this.dataDeCadastro = dataDeCadastro;
    this.dataDeVencimento = dataDeVencimento;
    this.tipoDePlano = tipoDePlano;
  }

  public UsuarioPremium() {
  }

  public String getDataDeCadastro() {
    return dataDeCadastro;
  }

  public void setDataDeCadastro(String dataDeCadastro) {
    this.dataDeCadastro = dataDeCadastro;
  }

  public String getDataDeVencimento() {
    return dataDeVencimento;
  }

  public void setDataDeVencimento(String dataDeVencimento) {
    this.dataDeVencimento = dataDeVencimento;
  }

  public String getTipoDePlano() {
    return tipoDePlano;
  }

  public void setTipoDePlano(String tipoDePlano) {
    this.tipoDePlano = tipoDePlano;
  }
}