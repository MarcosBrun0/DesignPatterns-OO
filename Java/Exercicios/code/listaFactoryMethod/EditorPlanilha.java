package listaFactoryMethod;

public class EditorPlanilha extends Editor {

    @Override
    protected String criarDocumento() {
        return "Criando Planilha";
    }

    public String abrirDocumento(){
        return criarDocumento();

    }
}
