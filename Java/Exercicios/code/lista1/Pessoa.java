package lista1;

public class Pessoa {
    private String nome;
    private int idade;
    public Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

    }




    public void MostrarPessoa() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println(endereco.toString());
    }
}
