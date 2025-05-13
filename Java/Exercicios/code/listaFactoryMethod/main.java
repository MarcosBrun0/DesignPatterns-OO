package listaFactoryMethod;

public class main {
    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();
        EditorPlanilha planilha = new EditorPlanilha();
        editor.abrirDocumento();

        System.out.println(editor.abrirDocumento());
        System.out.println(planilha.abrirDocumento());



    }
}
