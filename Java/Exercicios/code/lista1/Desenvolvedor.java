package lista1;

public class Desenvolvedor extends Funcionario {
private int Salario;
    @Override
    void calcularSalario() {
    this.Salario = 2000;
    System.out.println("lista1.Desenvolvedor: "+ Salario);
    }
}
