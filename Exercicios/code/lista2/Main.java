package lista2;

public class Main {
    public static void main(String[] args) {

        //exercicio 1
        Forma circulo = new Circulo();
        Forma retangulo = new Retangulo();

        System.out.println("Area Circulo:"+ circulo.calcularArea());
        System.out.println("Area Retangulo:"+ retangulo.calcularArea());

        //exercicio 2
        Instrumento violao = new Violao();
        Instrumento piano = new Piano();
        Instrumento bateria = new Bateria();

        System.out.println(violao.Tocar());
        System.out.println(piano.Tocar());
        System.out.println(bateria.Tocar());

        //exercicio 3
        Pagamento cartao = new PagamentoCartao();
        Pagamento boleto = new PagamentoBoleto();
        Pagamento pix = new PagamentoPix();

        System.out.println(cartao.processarPagamento());
        System.out.println(boleto.processarPagamento());
        System.out.println(pix.processarPagamento());
    }

}
