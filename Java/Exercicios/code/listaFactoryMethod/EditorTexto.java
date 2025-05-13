package listaFactoryMethod;

public class EditorTexto extends Editor {
    @Override
    protected String criarDocumento() {
        return "Criando Texto";
    }


public String abrirDocumento() {
        return criarDocumento();
    }
}
