package lista2;

public class PagamentoBoleto implements Pagamento{


    @Override
    public String processarPagamento() {
        return "Pagamento Boleto processado com sucesso!";
    }
}
