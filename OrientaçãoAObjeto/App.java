package OrientaçãoAObjeto;

public class App {
    public static void main(String[] args) throws Exception {

        // Criação de um objeto do tipo Usuario
        Usuario usuario1 = new Usuario();

        // Definindo os valores dos atributos do objeto
        usuario1.setNome("Pedro Arthur Rodrigues");
        usuario1.setEmail("pedro123@gmail.com");
        usuario1.setSenha("senha123");
        usuario1.setTelefone("1234567890");
        usuario1.setEndereco("Rua Antônio Dorileo, 123");
        usuario1.setDataNascimento("08/12/2006");
        usuario1.setCpf("093.349.561-78");
        usuario1.setNacionalidade("Brasileiro");

        // Exibindo os valores dos atributos do objeto
        System.out.println("Nome: " + usuario1.getNome());
        System.out.println("Email: " + usuario1.getEmail());
        System.out.println("Senha: " + usuario1.getSenha());
        System.out.println("Telefone: " + usuario1.getTelefone());
        System.out.println("Endereço: " + usuario1.getEndereco());
        System.out.println("Data de Nascimento: " + usuario1.getDataNascimento());
        System.out.println("CPF: " + usuario1.getCpf());
        System.out.println("Nacionalidade: " + usuario1.getNacionalidade());

    }
}
