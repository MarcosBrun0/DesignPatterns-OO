package lista2;

public class PagamentoCartao implements Pagamento{

    @Override
    public String processarPagamento() {
        return "Pagamento cartao processado com sucesso!";
    }
}
