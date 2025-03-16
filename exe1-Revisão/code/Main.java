public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev = new Desenvolvedor();
        Gerente gerente = new Gerente();
        Funcionario funcionario = new Funcionario();

        dev.calcularSalario();
        gerente.calcularSalario();
        funcionario.calcularSalario();



    }
}