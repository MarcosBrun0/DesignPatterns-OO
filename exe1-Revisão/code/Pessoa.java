public class Pessoa {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void MostrarIdade(Pessoa p){
        System.out.println("Idade: " + p.getIdade());
    }
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joao");
        p.setIdade(18);
        p.MostrarIdade(p);
    }
}
