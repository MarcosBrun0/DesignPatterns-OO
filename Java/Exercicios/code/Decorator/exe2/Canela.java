package Decorator.exe2;

public class Canela extends IngredientesDecorator implements Cafe{

    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public Double getValor() {
        return cafe.getValor()+ 0.75;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao()+", Canela";
    }
}
