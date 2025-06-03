package Decorator.exe1;

public class Negrito extends TextoSimples implements TextInterface{
    private TextoSimples texto;


    public Negrito(TextoSimples  texto) {
        this.texto = texto;

    }

    @Override
    public String print() {
        return "<b>" + texto.print() + "<b>";
    }
}
