public class Livro {
    public String titulo;
    public String autor;
    public int ano;

    public void Cadastrar(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    public void Mostrar() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);

    }
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.Cadastrar("ABC", "CBA", 2024);
        livro.Mostrar();
    }
}