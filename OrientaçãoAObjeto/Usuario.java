package OrientaçãoAObjeto;

public class Usuario {
  private String nome;
  private String email;
  private String senha;
  private String telefone;
  private String endereco;
  private String dataNascimento;
  private String cpf;
  private String nacionalidade;
  private String estadoCivil;
  private String profissao;

  public Usuario(String nome, String email, String senha, String telefone, String endereco, String dataNascimento,
      String cpf, String nacionalidade, String estadoCivil, String profissao) {

    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.telefone = telefone;
    this.endereco = endereco;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
    this.nacionalidade = nacionalidade;
    this.estadoCivil = estadoCivil;
    this.profissao = profissao;
  }

  public Usuario() {
  }

  /**
   * @return String return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return String return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return String return the senha
   */
  public String getSenha() {
    return senha;
  }

  /**
   * @param senha the senha to set
   */
  public void setSenha(String senha) {
    this.senha = senha;
  }

  /**
   * @return String return the telefone
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * @param telefone the telefone to set
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * @return String return the endereco
   */
  public String getEndereco() {
    return endereco;
  }

  /**
   * @param endereco the endereco to set
   */
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  /**
   * @return String return the dataNascimento
   */
  public String getDataNascimento() {
    return dataNascimento;
  }

  /**
   * @param dataNascimento the dataNascimento to set
   */
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  /**
   * @return String return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * @param cpf the cpf to set
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  /**
   * @return String return the nacionalidade
   */
  public String getNacionalidade() {
    return nacionalidade;
  }

  /**
   * @param nacionalidade the nacionalidade to set
   */
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  /**
   * @return String return the estadoCivil
   */
  public String getEstadoCivil() {
    return estadoCivil;
  }

  /**
   * @param estadoCivil the estadoCivil to set
   */
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  /**
   * @return String return the profissao
   */
  public String getProfissao() {
    return profissao;
  }

  /**
   * @param profissao the profissao to set
   */
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

}