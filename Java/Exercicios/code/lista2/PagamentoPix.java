package lista2;

public class PagamentoPix implements Pagamento{

    @Override
    public String processarPagamento() {
        return "Pagamento Pix processado com sucesso!";
    }
}
