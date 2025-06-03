package Decorator.exe1;

public class Main {
    public static void main(String[] args) {
        TextoSimples texto = new TextoSimples();
        texto.print();

        texto = new Negrito(texto);
        System.out.println(texto.print());


    }
}
