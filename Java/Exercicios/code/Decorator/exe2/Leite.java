package Decorator.exe2;

public class Leite extends IngredientesDecorator implements Cafe{
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Leite";
    }

    @Override
    public Double getValor() {
        return cafe.getValor() + 1.0;
    }
}
