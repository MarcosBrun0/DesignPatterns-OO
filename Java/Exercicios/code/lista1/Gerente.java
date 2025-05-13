package lista1;

public class Gerente extends Funcionario{
    private int Salario;

    @Override
    void calcularSalario() {
        this.Salario = 3000;
        System.out.println("lista1.Gerente: " + Salario);

    }
}
