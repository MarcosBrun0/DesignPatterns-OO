package Facade.exe2;

public class Main {
    public static void main(String[] args) {
        CartaoEstudante c = new CartaoEstudante();
        Email email = new Email();
        Dados d = new Dados();
        CadastroEstudanteFacade cadastro = new CadastroEstudanteFacade( d,  email,  c);
        cadastro.cadastrarEstudante();

    }
}
