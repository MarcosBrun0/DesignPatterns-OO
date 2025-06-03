package Facade.exe2;

public class CadastroEstudanteFacade {
    private CartaoEstudante cartaoEstudante;
    private Dados dados;
    private Email email;
    public CadastroEstudanteFacade(Dados dados, Email email, CartaoEstudante cartaoEstudante) {

        this.dados = dados;
        this.email = email;
        this.cartaoEstudante = cartaoEstudante;

    }
    public void cadastrarEstudante() {
        System.out.println("Cadastrando estudante...");
        dados.ValidacaoDeDados();
        cartaoEstudante.Gerar();
        email.EnviarEmail();
    }
}

