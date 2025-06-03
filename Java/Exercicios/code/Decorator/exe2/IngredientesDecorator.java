package Decorator.exe2;

public abstract class IngredientesDecorator implements Cafe{
    Cafe cafe;
    public IngredientesDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    public abstract String getDescricao();
    public abstract Double getValor();
}
