package Decorator.exe2;

public class Chocolate extends IngredientesDecorator{
    public Chocolate(Cafe cafe) {
        super(cafe);


    }

    @Override
    public Double getValor() {
        return cafe.getValor() + 1.5;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + ", Chocolate";
    }
}
