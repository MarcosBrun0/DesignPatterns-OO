package Decorator.exe2;

import Facade.exe2.Dados;

public class CafeSimples implements Cafe {
    private Double valor = 3.0;
    private String Descricao;

    @Override
    public  Double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return Descricao;
    }
}
