package Decorator.exe1;

public class TextoSimples implements TextInterface{
    private String texto = "ola mundo";



    @Override
    public String print() {

        return texto;
    }
}

