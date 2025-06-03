package Composite.exe1;

public class Main {
    public static void main(String[] args) {

        Folha folha = new Folha();
        Composto caixa1 = new Composto(folha);
        Composto caixa2 = new Composto(caixa1);
        Composto caixa3 = new Composto(caixa2);
        System.out.println(caixa3.operacao());
    }
}
