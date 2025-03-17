public class Main {
    public static void main(String[] args) {


    Endereco endereco = new Endereco();
    endereco.CadastrarEndereco("XV De Novembro","Campos Dos Goytacazes",3423);
    Pessoa pessoa = new Pessoa("Pedro",20,endereco);
    pessoa.MostrarPessoa();


    }
}