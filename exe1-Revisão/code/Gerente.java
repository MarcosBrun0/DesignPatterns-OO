public class Gerente extends Funcionario{
    private int Salario;

    @Override
    void calcularSalario() {
        this.Salario = 3000;
        System.out.println("Gerente: " + Salario);

    }
}
