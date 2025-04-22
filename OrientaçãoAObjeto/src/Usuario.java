package OrientaçãoAObjeto.src;

public class Usuario {
  private String nome;
  private String email;
  private int dataNascimento;
  private String senha;
  private String cpf;
  private String telefone;

  public Usuario(String nome, String email, int dataNascimento, String senha, String cpf, String telefone) {
    this.nome = nome;
    this.email = email;
    this.dataNascimento = dataNascimento;
    this.senha = senha;
    this.cpf = cpf;
    this.telefone = telefone;
  }

  public Usuario() {
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(int dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void salvar() {
    System.out.println("Usuario salvo com sucesso!");
    System.out.println("Nome: " + nome);
    System.out.println("Email: " + email);
    System.out.println("Data de Nascimento: " + dataNascimento);
    System.out.println("Senha: " + senha);
    System.out.println("CPF: " + cpf);
    System.out.println("Telefone: " + telefone);
  }

}